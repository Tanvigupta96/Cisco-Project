package com.example.ciscoproject.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ciscoproject.R;

import org.w3c.dom.Text;


public class ListOfSchemesViewHolder extends RecyclerView.ViewHolder {
    ImageView schemeImage;
    TextView title;
    TextView residentType;
    TextView incomeType;
    TextView gender;
    CardView cardView;
    TextView viewdetails;

    public ListOfSchemesViewHolder(View itemView) {
        super(itemView);
        schemeImage=itemView.findViewById(R.id.schemeImage);
        title=itemView.findViewById(R.id.schemetitle);
        residentType=itemView.findViewById(R.id.residenttype);
        incomeType=itemView.findViewById(R.id.incometype);
        gender=itemView.findViewById(R.id.gendertype);
        viewdetails=itemView.findViewById(R.id.viewdetails);
        cardView=itemView.findViewById(R.id.cardview);

    }
}
