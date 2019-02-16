package com.example.ciscoproject.model;


import java.io.Serializable;

public class Comment  {
    private String commentId;
    private String comment;

    public Comment() {
    }

    public Comment(String commentId, String comment) {
        this.commentId = commentId;
        this.comment = comment;
    }


    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
