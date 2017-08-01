package com.example.xuwanjin.handlerdemo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HandlerDemoActivity extends AppCompatActivity {
    public static final int SEND_MESSAGE = 0;

    Button button = null;
    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(SEND_MESSAGE == msg.what){
                TextView mTextView = findViewById(R.id.show_handler_result);
                mTextView.setVisibility(View.VISIBLE);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.communicate_handler_int);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mHandler.sendEmptyMessage(SEND_MESSAGE);
            }
        });
    }
}
