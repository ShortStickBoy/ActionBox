package com.sunzn.action.box.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sunzn.action.box.library.common.NoticeBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NoticeBox.newBox(MainActivity.this, R.layout.notice_box).setTime(1000).create().show();
//                NoticeBox.newBox(MainActivity.this).setCancelable(true).setCanceledOnTouch(true).create().show();
//                NoticeBox.newBox(MainActivity.this).setAudioListener(new NoticeBox.AudioListener() {
//                    @Override
//                    public void finish() {
//
//                    }
//
//                    @Override
//                    public void cancel() {
//
//                    }
//
//                    @Override
//                    public void dismiss() {
//
//                    }
//
//                }).setCancelable(true).setCanceledOnTouch(true).setDimAmount(0).create().postDelayShow(1000);
            }
        });
    }
}
