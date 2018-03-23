package com.org.curesoft.recyclerviewrrevktm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

/**
 * Created by Prabin kumar mallick on 12-02-2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.TestHolder>
{
    ArrayList<ProgrammingLanguage> lang;
    Context ctx;

    public CustomAdapter(ArrayList<ProgrammingLanguage> lang, Context ctx) {
        this.lang = lang;
        this.ctx = ctx;
    }

    @Override
    public TestHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null,false);//create View from row layout and give it to ViewHolder

        return new TestHolder(v);
    }

    @Override
    public void onBindViewHolder(TestHolder holder, int position) {
   ProgrammingLanguage pl= lang.get(position);
        holder.im.setImageResource(pl.imgIds);
        holder.tv.setText(pl.name);
    }

    @Override
    public int getItemCount() {
        return lang.size();
    }

    public class TestHolder extends RecyclerView.ViewHolder {
        ImageView im;//as Viewholder have imageview and textview here so
        TextView tv;
        public TestHolder(View itemView) {
            super(itemView);
            im= (ImageView) itemView.findViewById(R.id.image);
            tv= (TextView) itemView.findViewById(R.id.text);


        }
    }
}
