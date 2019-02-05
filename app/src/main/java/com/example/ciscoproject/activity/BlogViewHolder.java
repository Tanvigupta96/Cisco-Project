package com.example.ciscoproject.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ciscoproject.R;

public class BlogViewHolder extends RecyclerView.ViewHolder{

    public LinearLayout mView;
    public TextView post_title;
    public TextView post_desc;
    public TextView postUserName;

    public BlogViewHolder(View itemView) {
        super(itemView);
        mView = itemView.findViewById(R.id.root);
        post_title = mView.findViewById(R.id.post_title_txtview);
        post_desc = mView.findViewById(R.id.post_desc_txtview);
        postUserName = mView.findViewById(R.id.post_user);

    } public void setTitle(String title){
        post_title.setText(title);
    } public void setDesc(String desc){
        post_desc.setText(desc);
    } public void setUserName(String userName){
        postUserName.setText(userName);
    } }
