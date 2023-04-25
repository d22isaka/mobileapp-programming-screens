package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send = findViewById(R.id.sendButton);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText name = findViewById(R.id.namn);
                String namn = name.getText().toString();

                EditText size = findViewById(R.id.sko);
                String number = size.getText().toString();

                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("name",namn);
                intent.putExtra("number", number);
                startActivity(intent);
            }
        });

    }



}
