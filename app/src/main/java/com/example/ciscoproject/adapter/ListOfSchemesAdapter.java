package com.example.ciscoproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciscoproject.ClickListeners.SchemeClickListener;
import com.example.ciscoproject.R;
import com.example.ciscoproject.model.Scheme;

import java.util.ArrayList;

public class ListOfSchemesAdapter extends RecyclerView.Adapter<ListOfSchemesViewHolder> {
    Context context;
    ArrayList<Scheme> schemes;
    SchemeClickListener listener;


    public  ListOfSchemesAdapter(Context context,ArrayList<Scheme> schemes,SchemeClickListener listener){
        this.context=context;
        this.schemes=schemes;
        this.listener=listener;
    }


    @NonNull
    @Override
    public ListOfSchemesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowlayout=layoutInflater.inflate(R.layout.scheme_row_layout,parent,false);
        return new ListOfSchemesViewHolder(rowlayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ListOfSchemesViewHolder holder, int position) {
        final Scheme scheme=schemes.get(position);
        holder.schemeImage.setBackgroundResource(scheme.getUrl());
        holder.title.setText(scheme.getTitle());
        holder.residentType.setText(scheme.getResidentType().name());
        holder.gender.setText(scheme.getGender().name());
        holder.incomeType.setText(scheme.getIncomeType().name());
        holder.viewdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onSchemeClick(scheme);

            }
        });



    }

    @Override
    public int getItemCount() {
        return schemes.size();
    }
}
