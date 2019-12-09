package com.saroj.recycleremailviewassignment;

import java.util.Date;

public class Gmails {

    private String name;
    private String phoneNo;
    private int imageId;
    private String data;

    public Gmails(String name, String phoneNo, int imageId, String data) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.imageId = imageId;
        this.data= data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
