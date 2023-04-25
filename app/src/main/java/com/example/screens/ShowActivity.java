package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String number = extras.getString("number");

            TextView nameResult = findViewById(R.id.nameView);
            nameResult.setText(name);

            TextView sizeResult = findViewById(R.id.sizeView);
            sizeResult.setText(number);
            // Do something with the name and number
        }
    }
}