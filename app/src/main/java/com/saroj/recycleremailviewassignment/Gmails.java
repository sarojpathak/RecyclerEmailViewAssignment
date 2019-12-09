package com.saroj.recycleremailviewassignment;

import java.util.Date;

public class Gmails {

    private String name;
    private String message;
    private int imageId;
    private String data;

    public Gmails(String name, String message, int imageId, String data) {
        this.name = name;
        this.message = message;
        this.imageId = imageId;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
