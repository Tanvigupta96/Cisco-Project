package com.example.ciscoproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciscoproject.ClickListeners.SectorClickListener;
import com.example.ciscoproject.R;
import com.example.ciscoproject.model.SchemeCategory;

import java.util.ArrayList;

public class SchemesCatergoryAdapter extends RecyclerView.Adapter<SchemeCategoryViewHolder> {
    Context context;
    ArrayList<SchemeCategory> schemeCategories;
    SectorClickListener listener;


    public  SchemesCatergoryAdapter(Context context,ArrayList<SchemeCategory> schemeCategories,SectorClickListener listener){
        this.context=context;
        this.schemeCategories=schemeCategories;
        this.listener=listener;
    }



    @NonNull
    @Override
    public SchemeCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowlayout=layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new SchemeCategoryViewHolder(rowlayout);
    }

    @Override
    public void onBindViewHolder(@NonNull SchemeCategoryViewHolder holder, int position) {
        final SchemeCategory schemeCategory=schemeCategories.get(position);
        holder.title.setText(schemeCategory.getTitle());
        holder.background.setBackgroundResource(schemeCategory.getBackgroundDrawable());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onsectorclick(schemeCategory);

            }
        });

    }

    @Override
    public int getItemCount() {
        return schemeCategories.size();
    }
}
