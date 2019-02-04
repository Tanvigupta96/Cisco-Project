package com.example.ciscoproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ciscoproject.R;
import com.example.ciscoproject.model.SchemeCategory;

import java.util.ArrayList;

public class SchemesCatergoryAdapter extends RecyclerView.Adapter<SchemeCategoryViewHolder> {
    Context context;
    ArrayList<SchemeCategory> schemeCategories;

    public  SchemesCatergoryAdapter(Context context,ArrayList<SchemeCategory> schemeCategories){
        this.context=context;
        this.schemeCategories=schemeCategories;
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
        SchemeCategory schemeCategory=schemeCategories.get(position);
        holder.title.setText(schemeCategory.getTitle());
        holder.background.setBackgroundResource(schemeCategory.getBackgroundDrawable());

    }

    @Override
    public int getItemCount() {
        return schemeCategories.size();
    }
}
