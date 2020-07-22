package com.maquipuray.tarot_techtoserve.data;

/**
 * Created by rogergcc on 22/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class DragData {
    public final DataCards item;
    public final int width;
    public final int height;
    public final int position;

    public DragData(DataCards item, int width, int height, int position) {
        this.item = item;
        this.width = width;
        this.height = height;
        this.position = position;
    }


}