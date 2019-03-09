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

public class DataAdaptor_relation extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    String [] relation_mw;
    String [] relation_eng;
    int[] image;
    Context context;
    public DataAdaptor_relation(String [] relation_mw, String [] relation_eng, int[] image, Context context)
    {
        this.relation_mw = relation_mw;
        this.relation_eng = relation_eng;
        this.image = image;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View myownholder = inflater.inflate(R.layout.relation_tile,parent,false);
        return new DataAdaptor_relation.MyView(myownholder);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        MyView myView = (MyView)holder;
        myView.miwo_relation.setText(relation_mw[position]);
        myView.eng_relation.setText(relation_eng[position]);
        myView.image.setImageResource(image[position]);

    }

    @Override
    public int getItemCount()
    {
        return relation_eng.length;
    }

    private class MyView extends RecyclerView.ViewHolder
    {
        TextView miwo_relation;
        TextView eng_relation;
        ImageView image;
        public MyView(View itemView)
        {
            super(itemView);
            miwo_relation = itemView.findViewById(R.id.miwo_relation);
            eng_relation = itemView.findViewById(R.id.eng_relation);
            image = itemView.findViewById(R.id.image);
        }
    }
}
