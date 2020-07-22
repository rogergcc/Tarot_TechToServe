package com.maquipuray.tarot_techtoserve.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rogergcc on 21/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class DataCards implements Parcelable {
    protected DataCards(Parcel in) {
        id = in.readInt();
        name = in.readString();
        imageResource = in.readInt();
        imageUrl = in.readString();
    }

    public static final Creator<DataCards> CREATOR = new Creator<DataCards>() {
        @Override
        public DataCards createFromParcel(Parcel in) {
            return new DataCards(in);
        }

        @Override
        public DataCards[] newArray(int size) {
            return new DataCards[size];
        }
    };

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeInt(imageResource);
        parcel.writeString(imageUrl);
    }
}
