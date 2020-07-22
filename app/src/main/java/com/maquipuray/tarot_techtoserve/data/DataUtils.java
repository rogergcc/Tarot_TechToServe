package com.maquipuray.tarot_techtoserve.data;

import com.maquipuray.tarot_techtoserve.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rogergcc on 21/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class DataUtils {
    private DataUtils() {
    }

    public static final List<DataCards> cardsCompleteList = new ArrayList<>();

    public static List<DataCards> getcardsCompleteList() {
        return cardsCompleteList;
    }


    public static List<DataCards> randomSeriesList(int numberCards) {
        List<DataCards> givenList = cardsCompleteList;
        Collections.shuffle(givenList);
        return givenList.subList(0, numberCards);
    }


    static {
        cardsCompleteList.add(new DataCards(4, "el_emperador_4", R.drawable.el_emperador_4));
        cardsCompleteList.add(new DataCards(9, "hermitano_9", R.drawable.hermitano_9));
        cardsCompleteList.add(new DataCards(16, "la_torre_16", R.drawable.la_torre_16));
        cardsCompleteList.add(new DataCards(3, "la_emperatriz_3", R.drawable.la_emperatriz_3));
        cardsCompleteList.add(new DataCards(8, "la_justicia_8", R.drawable.la_justicia_8));
        cardsCompleteList.add(new DataCards(5, "el_sumo_sacerdote_5", R.drawable.el_sumo_sacerdote_5));
        cardsCompleteList.add(new DataCards(18, "la_luna_18", R.drawable.la_luna_18));
        cardsCompleteList.add(new DataCards(14, "la_templanza_14", R.drawable.la_templanza_14));
        cardsCompleteList.add(new DataCards(1, "el_mago_1", R.drawable.el_mago_1));
        cardsCompleteList.add(new DataCards(11, "la_fuerza_11", R.drawable.la_fuerza_11));
        cardsCompleteList.add(new DataCards(17, "la_estrella_17", R.drawable.la_estrella_17));
        cardsCompleteList.add(new DataCards(2, "la_sacerdotisa_2", R.drawable.la_sacerdotisa_2));
        cardsCompleteList.add(new DataCards(15, "el_diablo_15", R.drawable.el_diablo_15));
        cardsCompleteList.add(new DataCards(19, "el_sol_19", R.drawable.el_sol_19));
        cardsCompleteList.add(new DataCards(21, "el_mundo_21", R.drawable.el_mundo_21));
        cardsCompleteList.add(new DataCards(6, "los_enamorados_6", R.drawable.los_enamorados_6));
        cardsCompleteList.add(new DataCards(0, "el_loco_0", R.drawable.el_loco_0));
        cardsCompleteList.add(new DataCards(12, "el_colgado_12", R.drawable.el_colgado_12));
        cardsCompleteList.add(new DataCards(20, "el_juicio_20", R.drawable.el_juicio_20));
        cardsCompleteList.add(new DataCards(13, "la_muerte_13", R.drawable.la_muerte_13));
        cardsCompleteList.add(new DataCards(7, "el_carro_7", R.drawable.el_carro_7));
        cardsCompleteList.add(new DataCards(10, "rueda_de_la_fortuna_10", R.drawable.rueda_de_la_fortuna_10));
    }


}
