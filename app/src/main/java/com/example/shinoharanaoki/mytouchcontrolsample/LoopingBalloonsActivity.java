package com.example.shinoharanaoki.mytouchcontrolsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoopingBalloonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new LoopingBalloonsView(LoopingBalloonsActivity.this));
    }
}