package com.example.backgroundcolor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ConstraintLayout layout = findViewById(R.id.back);

        Intent intent = getIntent();
        int color = intent.getIntExtra("color", Color.WHITE);
        layout.setBackgroundColor(color);


    }
}
