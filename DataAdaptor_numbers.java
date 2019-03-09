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

public class DataAdaptor_numbers extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    String [] number;
    String [] miwoki;
    int [] image;
    Context context;

    public DataAdaptor_numbers(String[] number, String [] miwoki,int [] image,Context context)
    {
        this.number = number;
        this.miwoki = miwoki;
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater =LayoutInflater.from(context);
        View myownholder = layoutInflater.inflate(R.layout.number_tile,parent,false);
        return new DataAdaptor_numbers.MyView(myownholder);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        DataAdaptor_numbers.MyView myView = (MyView)holder;
        myView.number_m.setText(miwoki[position]);
        myView.number_e.setText(number[position]);
        myView.image.setImageResource(image[position]);
    }

    @Override
    public int getItemCount()
    {
        return number.length;
    }

    public class MyView extends RecyclerView.ViewHolder
    {
        TextView number_m;
        TextView number_e;
        ImageView image;

        public MyView(View ItemView)
        {
            super(ItemView);
            number_m = itemView.findViewById(R.id.miwo);
            number_e = itemView.findViewById(R.id.eng);
            image = itemView.findViewById(R.id.image);
        }
    }
}
