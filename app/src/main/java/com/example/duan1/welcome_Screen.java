package com.example.duan1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

public class welcome_Screen extends AppCompatActivity {
    ImageView img;
    Intent intent;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        img = (ImageView) findViewById(R.id.img_welcome);
        getSupportActionBar().hide();
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }
            @Override
            public void onFinish() {
                intent = new Intent(welcome_Screen.this, main_screen.class);
                startActivity(intent);
            }
        }.start();
    }

}
