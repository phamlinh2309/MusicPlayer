package com.example.duan1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class main_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Music Player");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setLogo(R.drawable.img_logo);
        actionBar.setDisplayUseLogoEnabled(true);
    }
}
