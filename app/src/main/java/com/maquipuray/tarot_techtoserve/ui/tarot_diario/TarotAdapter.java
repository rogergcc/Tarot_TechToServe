package com.maquipuray.tarot_techtoserve.ui.tarot_diario;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.maquipuray.tarot_techtoserve.R;
import com.maquipuray.tarot_techtoserve.data.DataCards;
import com.maquipuray.tarot_techtoserve.data.DragData;

import java.util.List;

/**
 * Created by rogergcc on 21/07/2020.
 * Copyright Ⓒ 2020 . All rights reserved.
 */

public class TarotAdapter extends
        RecyclerView.Adapter<TarotAdapter.ViewHolder> {

    private static ClickListener clickListener;
    private List<DataCards> dataCardsList;
    private Context context;
    private Drawable emojiForCircle = null;
    private Drawable backgroundCircle = null;
    private int upperCardSectionColor = 0;


    public TarotAdapter(List<DataCards> cardGameList,
                        Context context, ClickListener cardClickListener) {
        this.context = context;
        this.dataCardsList = cardGameList;

        clickListener = cardClickListener;
    }

    public static boolean checkAvailability(List<DataCards> cardGameList, DataCards cardGame) {
        for (DataCards card : cardGameList) {
            if (card.equals(cardGame)) {
                return true;
            }
        }

        return false;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int singleRvCardToUse = R.layout.item_card;
        View itemView = LayoutInflater.from(parent.getContext()).inflate(singleRvCardToUse, parent, false);


//        final View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_card, parent, false);
//        final ViewHolder holder = new ViewHolder(v);
//        final View shape = holder.imv_card;
//
////        View view = LayoutInflater.from(context).inflate(singleRvCardToUse, parent, false);
//        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                final DataCards item = dataCardsList.get(holder.getAdapterPosition());
//                final DragData state = new DragData(item, shape.getWidth(), shape.getHeight());
//                final View.DragShadowBuilder shadow = new View.DragShadowBuilder(shape);
//                ViewCompat.startDragAndDrop(shape, null, shadow, state, 0);
//                return true;
//            }
//        });
//
//        return holder;

        return new ViewHolder(itemView);

//        View itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.rv_item_cardgame, parent, false);
//        // work here if you need to control height of your items
//        // keep in mind that parent is RecyclerView in this case
//        int height = parent.getMeasuredHeight() / 3;
//        itemView.setMinimumHeight(height);
//        return new ViewHolder(itemView);

    }

    @Override
    public long getItemId(int position) {
        DataCards cardGame = dataCardsList.get(position);
        return cardGame.getId();
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return dataCardsList.size();
    }

    @Override
    public void onBindViewHolder(final ViewHolder card, int position) {

        final DataCards data = dataCardsList.get(position);
        final View shape = card.imv_card;
        card.imv_card.setImageResource(data.getImageResource());
        card.imv_card.setOnLongClickListener(v -> {
            final DataCards item = dataCardsList.get(card.getLayoutPosition());
            final DragData state = new DragData(item, shape.getWidth(), shape.getHeight(), position);
            final View.DragShadowBuilder shadow = new View.DragShadowBuilder(shape);

            ViewCompat.startDragAndDrop(shape, null, shadow, state, 0);


            return true;
        });


        //region REGION WITH IMAGES RESOURCE DRAWABLE
//        card.imageViewFront.setEnabled(false);


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
////                    rotateHorizontalScale(locationCard.getImageResource(), card.imageViewFront, 120);
//                rotateHorizontalScaleLayout(card.rl_offline_item, locationCard.getImageResource(), card.imageViewFront, 120);
//            }
//        }, ConstantsGame.DELAY_TIME_AFTER_FIRST_IMAGES);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                rotateHorizontalScaleLayout(card.rl_offline_item, R.drawable.ic_question, card.imageViewFront, 120);
//                card.imageViewFront.setEnabled(true);
//            }
//        }, ConstantsGame.DIFFICULTY_GAME_TIME_SWIP_SELECTED);

//        card.imv_card.setImageResource(data.getImageResource());
        card.imv_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // clickListener.onItemClick(position, card.imv_card, data);
            }
        });


        //endregion


    }

    private void setAlphas(ViewHolder card, float addressAlpha, float hoursHeaderAlpha, float hoursNumAlpha,
                           float phoneHeaderAlpha, float phoneNumAlpha, float milesAbbreviationAlpha) {
//        card.addressTextView.setAlpha(addressAlpha);
//        card.hoursHeaderTextView.setAlpha(hoursHeaderAlpha);
//        card.hoursTextView.setAlpha(hoursNumAlpha);
//        card.phoneHeaderTextView.setAlpha(phoneHeaderAlpha);
//        card.phoneNumTextView.setAlpha(phoneNumAlpha);
//        card.milesAbbreviationTextView.setAlpha(milesAbbreviationAlpha);
    }


    public interface ClickListener {
        void onItemClick(int position, ImageView view, DataCards card);
//        void onItemClick(int position, Rela view);
    }


    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

//        ImageView imgv_item;

//        CardView cardView;


        ImageView imv_card;
        ImageView imageViewBack;
        RelativeLayout rl_offline_item;

        ViewHolder(View itemView) {
            super(itemView);

//            flipView_card = itemView.findViewById(R.id.flipView_card);
            imv_card = itemView.findViewById(R.id.imv_card);
//            rl_offline_item = itemView.findViewById(R.id.rl_offline_item);
//            imageViewBack = itemView.findViewById(R.id.imgBackCard);


//            imageViewFront.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    clickListener.onItemClick(getLayoutPosition(), imageViewFront, rl_offline_item);
//                }
//            });

        }

        @Override
        public void onClick(View view) {
        }
    }
}