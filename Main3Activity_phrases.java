package com.example.nilotpal.languageapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nilotpal.languageapp.Adapters.DataAdaptor_phrases;
import com.example.nilotpal.languageapp.R;

public class Main3Activity_phrases extends AppCompatActivity
{
    RecyclerView recyclerView;
    String [] miwoki = {"minto wuksus" , "tinnә oyaase'nә" , "oyaaset..." , "michәksәs?" , "kuchi achit" , "әәnәs'aa?" ,"hәә’әәnәm" , "әәnәm" , "yoowutis"  , "әnni'nem"};
    String [] english = {"Where are you going?" , "What is your name?" , "My name is..." , "How are you feeling?" , "I’m feeling good." , "Are you coming?" , "Yes, I’m coming." , "I’m coming." , "Let’s go." , "Come here."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_phrases);
        recyclerView=findViewById(R.id.recycle);
        DataAdaptor_phrases dataAdaptor_phrases = new DataAdaptor_phrases(miwoki,english,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(dataAdaptor_phrases);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
