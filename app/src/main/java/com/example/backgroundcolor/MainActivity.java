package com.example.backgroundcolor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Button bOk;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bOk = findViewById(R.id.button);
        et = findViewById(R.id.editText);
        tv = findViewById(R.id.textView);

        bOk.setOnClickListener(view -> {

            String newBackgroundColor = et.getText().toString().toLowerCase();
            HashMap<String, Integer> map = new HashMap<>();
            map.put("red", Color.RED);
            map.put("green", Color.GREEN);
            map.put("blue", Color.BLUE);

            if (map.get(newBackgroundColor) != null) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("color", map.get(newBackgroundColor));
                this.startActivity(intent);
            }
            else {
                Toast.makeText(MainActivity.this, "Incorrect color!", Toast.LENGTH_LONG).show();
            }
        });
    }


}
