package com.example.ciscoproject.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ciscoproject.R;


public class SchemeCategoryViewHolder extends RecyclerView.ViewHolder {
    ImageView background;
    TextView title;
    CardView cardview;


    public SchemeCategoryViewHolder(View itemView) {
        super(itemView);
        background=itemView.findViewById(R.id.background);
        title=itemView.findViewById(R.id.schemetitle);
        cardview=itemView.findViewById(R.id.cardview);


    }
}
