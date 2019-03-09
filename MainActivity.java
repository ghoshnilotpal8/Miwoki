package com.example.nilotpal.languageapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nilotpal.languageapp.R;

public class MainActivity extends AppCompatActivity {
    Button numbers;
    Button colour;
    Button relation;
    Button phrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = findViewById(R.id.number);
        colour = findViewById(R.id.colour);
        relation = findViewById(R.id.relation);
        phrases= findViewById(R.id.phrase);

        numbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity_numbers.class);
                startActivity(intent);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(MainActivity.this,Main3Activity_phrases.class);
                startActivity(intent);
            }
        });
        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main4Activity_colour.class);
                startActivity(intent);
            }
        });
        relation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main5Activity_relation.class);
                startActivity(intent);
            }
        });
    }
}

