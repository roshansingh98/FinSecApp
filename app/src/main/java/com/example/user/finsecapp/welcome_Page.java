package com.example.user.finsecapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class welcome_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__page);

        new CountDownTimer(2000,1000){
            public void onTick(long milliuntildone)
            {
               // Log.i("time passed",String.valueOf(milliuntildone/1000));
            }
            public void onFinish(){
                Intent intent=new Intent(getApplicationContext(),mainPage.class);
                startActivity(intent);
                finish();
            }

        }.start();

    }
}
