package com.example.ciscoproject.activity;

public class Blog {
    // define four String variables
    private String title, desc, username;
    // generate their respective constructors
    public Blog(String title, String desc, String username) {
        this.title = title;
        this.desc = desc;
        //this.imageUrl=imageUrl;
        this.username = username;
    }
    // create an empty constructor
    public Blog() {
    }
    /*public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }*/
    public void setUsername(String username) {
        this.username = username;
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
    public String getUsername() {
        return username;
    }
}

