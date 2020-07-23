package com.maquipuray.tarot_techtoserve.data;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.maquipuray.tarot_techtoserve.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    public static <T> T getRandomItemFromList(List<T> list) {
        Random random = new Random();
        int listSize = list.size();
        int randomIndex = random.nextInt(listSize);
        return list.get(randomIndex);
    }


    static {
        cardsCompleteList.add(new DataCards(4, "el emperador", R.drawable.el_emperador_4));
        cardsCompleteList.add(new DataCards(9, "hermitano", R.drawable.hermitano_9));
        cardsCompleteList.add(new DataCards(16, "la torre", R.drawable.la_torre_16));
        cardsCompleteList.add(new DataCards(3, "la emperatriz", R.drawable.la_emperatriz_3));
        cardsCompleteList.add(new DataCards(8, "la justicia", R.drawable.la_justicia_8));
        cardsCompleteList.add(new DataCards(5, "el sumo sacerdote", R.drawable.el_sumo_sacerdote_5));
        cardsCompleteList.add(new DataCards(18, "la luna", R.drawable.la_luna_18));
        cardsCompleteList.add(new DataCards(14, "la templanza", R.drawable.la_templanza_14));
        cardsCompleteList.add(new DataCards(1, "el mago", R.drawable.el_mago_1));
        cardsCompleteList.add(new DataCards(11, "la fuerza", R.drawable.la_fuerza_11));
        cardsCompleteList.add(new DataCards(17, "la estrella", R.drawable.la_estrella_17));
        cardsCompleteList.add(new DataCards(2, "la sacerdotisa", R.drawable.la_sacerdotisa_2));
        cardsCompleteList.add(new DataCards(15, "el diablo", R.drawable.el_diablo_15));
        cardsCompleteList.add(new DataCards(19, "el sol", R.drawable.el_sol_19));
        cardsCompleteList.add(new DataCards(21, "el mundo", R.drawable.el_mundo_21));
        cardsCompleteList.add(new DataCards(6, "los enamorados", R.drawable.los_enamorados_6));
        cardsCompleteList.add(new DataCards(0, "el loco", R.drawable.el_loco_0));
        cardsCompleteList.add(new DataCards(12, "el colgado ", R.drawable.el_colgado_12));
        cardsCompleteList.add(new DataCards(20, "el juicio ", R.drawable.el_juicio_20));
        cardsCompleteList.add(new DataCards(13, "la muerte ", R.drawable.la_muerte_13));
        cardsCompleteList.add(new DataCards(7, "el carro", R.drawable.el_carro_7));
        cardsCompleteList.add(new DataCards(10, "rueda de la fortuna", R.drawable.rueda_de_la_fortuna_10));
    }

    public static void rotateHorizontalSBack(final Context context, final int imageGlide, final ImageView img_flip_animator) {
        final ObjectAnimator oa1 = ObjectAnimator.ofFloat(img_flip_animator, "scaleX", 1f, 0f);
        final ObjectAnimator oa2 = ObjectAnimator.ofFloat(img_flip_animator, "scaleX", 0f, 1f);
        oa1.setInterpolator(new DecelerateInterpolator());
        oa2.setInterpolator(new AccelerateDecelerateInterpolator());
        oa1.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
//                img_flip_animator.setImageResource(imageGlide);
//                setImageGlide(imageGlide, img_flip_animator, context);
                img_flip_animator.setImageResource(imageGlide);
                oa2.setDuration(600);
                oa2.start();
            }
        });
        oa1.setDuration(600);

        oa1.start();
    }

}
