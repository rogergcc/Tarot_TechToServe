package com.maquipuray.tarot_techtoserve.data;

/**
 * Created by rogergcc on 21/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class DataCards {
    @Override
    public String toString() {
        return "DataCards{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageResource=" + imageResource +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    private int id;
    private String name;
    private int imageResource;
    private String imageUrl;

    public DataCards(int id, String name, int imageResource) {
        this.id = id;
        this.name = name;
        this.imageResource = imageResource;
    }


}
