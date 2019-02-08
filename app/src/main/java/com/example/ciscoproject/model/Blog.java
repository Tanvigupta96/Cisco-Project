package com.example.ciscoproject.model;

public class Blog {
    // define four String variables
    private String title, desc, uid;
    // generate their respective constructors
    public Blog(String title, String desc, String uid) {
        this.title = title;
        this.desc = desc;
        //this.imageUrl=imageUrl;
        this.uid = uid;
    }
    // create an empty constructor
    public Blog() {
    }
    /*public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }*/
    public void setUid(String uid) {
        this.uid = uid;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /*public String getImageUrl() {
        return imageUrl;
    }*/
    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }
    public String getUid() {
        return uid;
    }
}

