package com.example.nilotpal.languageapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nilotpal.languageapp.Adapters.DataAdaptor_relation;
import com.example.nilotpal.languageapp.R;

public class Main5Activity_relation extends AppCompatActivity
{
    String [] name = {"әpә" , "әṭa" , "angsi" , "tune" , "taachi" , "chalitti" , "teṭe" , "kolliti" , "ama" , "paapa"};
    String [] relation = {"father" , "mother" , "son" , "daughter" , "older brother" , "younger brother" , "older sister" , "younger sister" , "grandmother" ,  "grandfather"};
    int [] image = {R.drawable.family_father,R.drawable.family_mother,R.drawable.family_son,R.drawable.family_daughter,R.drawable.family_older_brother,R.drawable.family_younger_brother,R.drawable.family_older_sister,R.drawable.family_younger_sister,R.drawable.family_grandmother,R.drawable.family_grandfather};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_relation);
        RecyclerView recyclerView = findViewById(R.id.recycle);
        DataAdaptor_relation dataAdaptor_relation = new DataAdaptor_relation(name,relation,image,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dataAdaptor_relation);
    }
}
