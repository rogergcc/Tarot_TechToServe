package com.maquipuray.tarot_techtoserve.helpers;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by rogergcc on 21/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */
public class OverlapDecoration extends RecyclerView.ItemDecoration {

    //Following code from : http://stackoverflow.com/questions/27633454/how-to-overlap-items-in-linearlayoutmanager-recyclerview-like-stacking-cards
//    private final static int overlap = -100;
    private final static int overlap = -70;

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        final int itemPosition = parent.getChildAdapterPosition(view);
        if (itemPosition == 0) {
            outRect.set(0, 0, 0, 0);
        } else {
            outRect.set(overlap, 0, 0, 0);
        }
    }
}