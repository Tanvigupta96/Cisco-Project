package com.example.ciscoproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ciscoproject.R;

public class CommentViewHolder extends RecyclerView.ViewHolder {

    View view;
    TextView comment_id;
    TextView comment_desc;

    public CommentViewHolder(View itemView) {
        super(itemView);
        view=itemView;
        comment_id=view.findViewById(R.id.comment_user);
        comment_desc=view.findViewById(R.id.comment_desc);
    }

    public void setComment_id(String comment) {
        comment_id.setText(comment);
    }

    public void setComment_desc(String comment) {
        comment_desc.setText(comment);
    }
}
