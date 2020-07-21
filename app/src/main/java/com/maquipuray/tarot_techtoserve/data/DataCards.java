package com.maquipuray.tarot_techtoserve.data;

import com.maquipuray.tarot_techtoserve.R;

import java.util.ArrayList;
import java.util.List;

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

    public static final List<DataCards> cardsList = new ArrayList<>();

    public static List<DataCards> getCardsList() {
        return cardsList;
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

    static {
        cardsList.add(new DataCards(4, "el_emperador_4", R.drawable.el_emperador_4));
        cardsList.add(new DataCards(9, "hermitano_9", R.drawable.hermitano_9));
        cardsList.add(new DataCards(16, "la_torre_16", R.drawable.la_torre_16));
        cardsList.add(new DataCards(3, "la_emperatriz_3", R.drawable.la_emperatriz_3));
        cardsList.add(new DataCards(8, "la_justicia_8", R.drawable.la_justicia_8));
        cardsList.add(new DataCards(5, "el_sumo_sacerdote_5", R.drawable.el_sumo_sacerdote_5));
        cardsList.add(new DataCards(18, "la_luna_18", R.drawable.la_luna_18));
        cardsList.add(new DataCards(14, "la_templanza_14", R.drawable.la_templanza_14));
        cardsList.add(new DataCards(1, "el_mago_1", R.drawable.el_mago_1));
        cardsList.add(new DataCards(11, "la_fuerza_11", R.drawable.la_fuerza_11));
        cardsList.add(new DataCards(17, "la_estrella_17", R.drawable.la_estrella_17));
        cardsList.add(new DataCards(2, "la_sacerdotisa_2", R.drawable.la_sacerdotisa_2));
        cardsList.add(new DataCards(15, "el_diablo_15", R.drawable.el_diablo_15));
        cardsList.add(new DataCards(19, "el_sol_19", R.drawable.el_sol_19));
        cardsList.add(new DataCards(21, "el_mundo_21", R.drawable.el_mundo_21));
        cardsList.add(new DataCards(6, "los_enamorados_6", R.drawable.los_enamorados_6));
        cardsList.add(new DataCards(0, "el_loco_0", R.drawable.el_loco_0));
        cardsList.add(new DataCards(12, "el_colgado_12", R.drawable.el_colgado_12));
        cardsList.add(new DataCards(20, "el_juicio_20", R.drawable.el_juicio_20));
        cardsList.add(new DataCards(13, "la_muerte_13", R.drawable.la_muerte_13));
        cardsList.add(new DataCards(7, "el_carro_7", R.drawable.el_carro_7));
        cardsList.add(new DataCards(10, "rueda_de_la_fortuna_10", R.drawable.rueda_de_la_fortuna_10));
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
