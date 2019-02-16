package com.example.ciscoproject.model;

import java.io.Serializable;

public class Blog {
    // define four String variables
    private String title, desc, uid,likeno,commentno;
    // generate their respective constructors
    public Blog(String title, String desc, String uid,String likeno,String commentno) {
        this.title = title;
        this.desc = desc;
        this.uid = uid;
        this.commentno=commentno;
        this.likeno=likeno;
    }
    // create an empty constructor
    public Blog() {
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }
    public String getUid() {
        return uid;
    }

    public String getLikeno() {
        return likeno;
    }

    public void setLikeno(String likeno) {
        this.likeno = likeno;
    }

    public String getCommentno() {
        return commentno;
    }

    public void setCommentno(String commentno) {
        this.commentno = commentno;
    }
}

