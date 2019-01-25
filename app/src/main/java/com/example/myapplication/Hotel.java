package com.example.myapplication;

public class Hotel {
    public int images ;

    public String data;
    public String desc;

    public Hotel() {
    }

    public Hotel( int images, String data, String desc) {
        this.images = images;
        this.data = data;
        this.desc = desc;
    }

//    public int getImage(int images) {
//        return images;
//
//    }

//    public void setImage(int images) {
//        this.images = images;
//    }
//
//
//
//    public void setData(String data) {
//        this.data = data;
//    }
//
//
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//}

    public String getDesc() {
        return desc;
    }

    public String getData() {
        return data;
    }

    public int getImage() {
        return images;
    }
}
