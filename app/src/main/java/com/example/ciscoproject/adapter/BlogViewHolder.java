package com.example.ciscoproject.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ciscoproject.R;

public class BlogViewHolder extends RecyclerView.ViewHolder{

    //public LinearLayout mView;
    View mView;
    public TextView post_title;
    public TextView post_desc;
    public TextView postUserName;
    public ImageView postComment;
    public ImageView postLike;
    public LinearLayout commentBox,comment_view;
    public TextView postCommentNo;
    public TextView postLikeNo;
    public EditText editComment;
    public ImageView sendComment;
    public RecyclerView comment;

    public BlogViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        post_title = mView.findViewById(R.id.post_title_txtview);
        post_desc = mView.findViewById(R.id.post_desc_txtview);
        postUserName=mView.findViewById(R.id.post_user);
        postComment=mView.findViewById(R.id.comment);
        postLike= mView.findViewById(R.id.like);
        postCommentNo=mView.findViewById(R.id.text_comment);
        postLikeNo=mView.findViewById(R.id.text_like);
        commentBox=mView.findViewById(R.id.commentbox);
        editComment=mView.findViewById(R.id.edit_comment);
        sendComment=mView.findViewById(R.id.send_comment);
        comment_view=mView.findViewById(R.id.comment_view);
        comment=mView.findViewById(R.id.recyclerview1);
    }


    public void setTitle(String title){

        post_title.setText(title);
    }
    public void setDesc(String desc){

        post_desc.setText(desc);
    }
    public void setUserName(String userName){

        postUserName.setText(userName);
    }
    public void setCommentNo(String postNo) {
       postCommentNo.setText(postNo);
    }

    public void setLikeNo(String postNo) {
        postLikeNo.setText(postNo);
    }

}

