package com.example.nilotpal.languageapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nilotpal.languageapp.Adapters.DataAdaptor_colour;
import com.example.nilotpal.languageapp.R;

public class Main4Activity_colour extends AppCompatActivity
{
    RecyclerView recyclerView;
    String [] miwoki = {"weṭeṭṭi" ,"chokokki" ,"ṭakaakki" , "ṭopoppi" , "kululli" , "kelelli" , "ṭopiisә" , "chiwiiṭә" };
    String [] eng = {"red" , "green" , "brown" , "gray" , "black" ,"white" , "dusty yellow" , "mustard yellow" };
    int []  color  = {R.drawable.color_red,R.drawable.color_green,R.drawable.color_brown,R.drawable.color_gray,R.drawable.color_black,R.drawable.color_white,R.drawable.color_dusty_yellow,R.drawable.color_mustard_yellow};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_colour);
        recyclerView=findViewById(R.id.recycle);
        DataAdaptor_colour dataAdaptor_colour = new DataAdaptor_colour(miwoki,eng,color,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(dataAdaptor_colour);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}