package com.makeus.recyclerviewtest;

import android.graphics.drawable.Drawable;

public class Person {

    String memo;
    String date;
    String name;
    Drawable image;
    Integer viewType;

    public Person(String memo, String date, String name, Drawable image, Integer viewType) {
        this.memo = memo;
        this.date = date;
        this.name = name;
        this.image = image;
        this.viewType = viewType;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public Drawable getImage() {
        return image;
    }

    public String getMemo() {
        return memo;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

}
