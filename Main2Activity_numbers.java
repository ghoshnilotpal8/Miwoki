package com.example.nilotpal.languageapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.nilotpal.languageapp.Adapters.DataAdaptor_numbers;
import com.example.nilotpal.languageapp.R;

public class Main2Activity_numbers extends AppCompatActivity
{
    RecyclerView recyclerView;
    String [] number = {"one" , "two", "three" , "four" , "five" , "six" , "seven" , "eight" , "nine" , "ten"};
    String [] miwoki = {"lutti" , "otiiko" , "tolookosu" , "oyyisa" , "massokka" , "temmokka" , "kenekaku" , "kawinta" , "wo’e" , "na’aacha"};
    int [] image = {R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,R.drawable.number_four,R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_numbers);
        recyclerView = findViewById(R.id.recycle);
        DataAdaptor_numbers dataAdaptor_numbers = new DataAdaptor_numbers(number,miwoki,image,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(dataAdaptor_numbers);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
