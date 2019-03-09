package com.example.nilotpal.languageapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nilotpal.languageapp.R;

import java.text.BreakIterator;

public class DataAdaptor_colour extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    String [] miwoki;
    Context context;
    String [] eng;
    int [] color;
    public DataAdaptor_colour(String [] miwoki,String[] eng,int [] color, Context context )
    {
        this.miwoki = miwoki;
        this.context = context;
        this.eng = eng;
        this.color = color;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View myownholder = inflater.inflate(R.layout.color_tile,parent,false);
        return new MyView(myownholder);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        MyView myView = (MyView)holder;
        myView.color_m.setText(miwoki[position]);
        myView.color_e.setText(eng[position]);
        myView.color.setImageResource(color[position]);
    }

    @Override
    public int getItemCount()

    {
        return miwoki.length;
    }

    public class MyView extends RecyclerView.ViewHolder
    {
        TextView color_e;
        TextView color_m;
        ImageView color;

        public MyView(View itemView)
        {
            super(itemView);
            color_m = itemView.findViewById(R.id.miwo);
            color_e = itemView.findViewById(R.id.eng);
            color = itemView.findViewById(R.id.color);
        }
    }
}
