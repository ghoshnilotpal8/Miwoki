package com.example.nilotpal.languageapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nilotpal.languageapp.R;

public class DataAdaptor_phrases extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    String [] miwoki;
    String [] eng;
    Context context;

    public DataAdaptor_phrases(String[] miwoki, String[] eng, Context context) {
        this.miwoki = miwoki;
        this.eng = eng;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View myownholder = inflater.inflate(R.layout.phrases_tile,parent,false);
        return new MyView(myownholder);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        MyView myView = (MyView)holder;
        myView.phrases_m.setText(miwoki[position]);
        myView.phrases_e.setText(eng[position]);
    }

    @Override
    public int getItemCount() {
        return miwoki.length;
    }
    public class MyView extends RecyclerView.ViewHolder
    {
        TextView phrases_m;
        TextView phrases_e;

        public MyView(View itemView)
        {
            super(itemView);
            phrases_m=itemView.findViewById(R.id.miwo);
            phrases_e=itemView.findViewById(R.id.eng);
        }
    }
}
