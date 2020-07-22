package com.maquipuray.tarot_techtoserve.ui.tarot_diario;

import android.content.Context;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maquipuray.tarot_techtoserve.R;
import com.maquipuray.tarot_techtoserve.data.DataCards;
import com.maquipuray.tarot_techtoserve.data.DataUtils;
import com.maquipuray.tarot_techtoserve.data.DragData;
import com.maquipuray.tarot_techtoserve.databinding.ActivityTarotDiarioBinding;
import com.maquipuray.tarot_techtoserve.helpers.OverlapDecoration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarotDiarioActivity extends AppCompatActivity
        implements TarotAdapter.ClickListener {

    ActivityTarotDiarioBinding activityTarotDiarioBinding;
    TarotAdapter tarotAdapter;
    private int countCardClick = 0;
    private List<DataCards> dataCards;

    private Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tarot_diario);

        activityTarotDiarioBinding = ActivityTarotDiarioBinding.inflate(getLayoutInflater());
        View view = activityTarotDiarioBinding.getRoot();
        setContentView(view);

//        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(activityTarotDiarioBinding.toolbar);

        mcontext = this;
        initView();

        activityTarotDiarioBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    public void initView() {
        dataCards = new ArrayList<>();
        dataCards.clear();
//        RecyclerView rv_ = findViewById(R.id.rv_list);

        activityTarotDiarioBinding.rvList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        activityTarotDiarioBinding.rvList.setHasFixedSize(true);
        activityTarotDiarioBinding.rvList.setHasFixedSize(true);

        RecyclerView.ItemDecoration decoration = new OverlapDecoration();
        activityTarotDiarioBinding.rvList.addItemDecoration(decoration);
        Collections.shuffle(DataUtils.getcardsCompleteList());
        dataCards.addAll(DataUtils.getcardsCompleteList());
        tarotAdapter = new TarotAdapter(DataUtils.getcardsCompleteList(), this, this);
        activityTarotDiarioBinding.rvList.setAdapter(new TarotAdapter(DataUtils.getcardsCompleteList(), this, this));


        activityTarotDiarioBinding.imgv1stCard.setEnabled(true);
        activityTarotDiarioBinding.imgv2ndCard.setEnabled(false);
        activityTarotDiarioBinding.imgv3rdCard.setEnabled(false);
        activityTarotDiarioBinding.imgv4thCard.setEnabled(false);
        activityTarotDiarioBinding.imgv5thCard.setEnabled(false);

        activityTarotDiarioBinding.tvImgv2.setText("");
        activityTarotDiarioBinding.tvImgv3.setText("");
        activityTarotDiarioBinding.tvImgv4.setText("");
        activityTarotDiarioBinding.tvImgv5.setText("");

        initContainer(activityTarotDiarioBinding.imgv1stCard, activityTarotDiarioBinding.tvImgv1, 1);
        initContainer(activityTarotDiarioBinding.imgv2ndCard, activityTarotDiarioBinding.tvImgv2, 2);
        initContainer(activityTarotDiarioBinding.imgv3rdCard, activityTarotDiarioBinding.tvImgv3, 3);
        initContainer(activityTarotDiarioBinding.imgv4thCard, activityTarotDiarioBinding.tvImgv4, 4);
        initContainer(activityTarotDiarioBinding.imgv5thCard, activityTarotDiarioBinding.tvImgv5, 5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tarot_menu, menu);

        return true;
    }

    private void initContainer(ImageView imageView, TextView textView, int positionCardCruz) {
        imageView.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View view, DragEvent dragEvent) {

                switch (dragEvent.getAction()) {
                    case DragEvent.ACTION_DRAG_ENTERED:
                        imageView.setBackgroundColor(getResources().getColor(R.color.mid));

                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
//                        imageView.setBackgroundColor(Color.RED);
                        imageView.setBackgroundColor(getResources().getColor(R.color.drag_exit));
                        break;
                    case DragEvent.ACTION_DRAG_ENDED:
//                        imageView.setBackgroundColor(Color.WHITE);
                        imageView.setBackgroundColor(getResources().getColor(R.color.drag_ended));
                        break;
                    case DragEvent.ACTION_DROP:
                        //  final float dropX = dragEvent.getX();
                        //  final float dropY = dragEvent.getY();
                        final DragData state = (DragData) dragEvent.getLocalState();

//                        setImgIntoContainer(state.item);


                        if (positionCardCruz == 1) {
                            activityTarotDiarioBinding.imgv2ndCard.setEnabled(true);
                            activityTarotDiarioBinding.tvImgv2.setText(getString(R.string.tv_message_card));
                        }
                        if (positionCardCruz == 2) {
                            activityTarotDiarioBinding.imgv3rdCard.setEnabled(true);
                            activityTarotDiarioBinding.tvImgv3.setText(getString(R.string.tv_message_card));
                        }
                        if (positionCardCruz == 3) {
                            activityTarotDiarioBinding.imgv4thCard.setEnabled(true);
                            activityTarotDiarioBinding.tvImgv4.setText(getString(R.string.tv_message_card));
                        }
                        if (positionCardCruz == 4) {
                            activityTarotDiarioBinding.imgv5thCard.setEnabled(true);
                            activityTarotDiarioBinding.tvImgv5.setText(getString(R.string.tv_message_card));
                        }


                        if (positionCardCruz == 5) {
                            activityTarotDiarioBinding.rvList.setVisibility(View.GONE);
                            activityTarotDiarioBinding.tvEligaSuCarta.setVisibility(View.GONE);
                            activityTarotDiarioBinding.btnVerLectura.setVisibility(View.VISIBLE);

                        }
//                        imageView.setImageResource(state.item.getImageResource()); //always random card from deck

//                        imageView.setImageResource(dataCards.get(state.position).getImageResource());
                        imageView.setImageResource(state.item.getImageResource());

                        imageView.setImageResource(R.drawable.carta);
                        Toast.makeText(TarotDiarioActivity.this, "Carta: " + state.item.getName(), Toast.LENGTH_SHORT).show();

                        DataUtils.rotateHorizontalSBack(mcontext, state.item.getImageResource(), imageView);
                        textView.setVisibility(View.GONE);
                        imageView.setEnabled(false);

                    default:
                        break;
                }
                return true;
            }
        });


    }


    private void setImgIntoContainer(ImageView imageView, DataCards data) {
        activityTarotDiarioBinding.imgv1stCard.setImageResource(data.getImageResource());
    }

    @Override
    public void onItemClick(int position, ImageView view, DataCards card) {
        countCardClick++;

        if (countCardClick == 1) {
            activityTarotDiarioBinding.imgv1stCard.setImageResource(card.getImageResource());
//            activityTarotDiarioBinding.tvImgv1.setVisibility(View.GONE);


        }
        if (countCardClick == 2) {
            activityTarotDiarioBinding.imgv2ndCard.setImageResource(card.getImageResource());
            activityTarotDiarioBinding.tvImgv2.setVisibility(View.GONE);
        }
        if (countCardClick == 3) {
            activityTarotDiarioBinding.imgv3rdCard.setImageResource(card.getImageResource());
            activityTarotDiarioBinding.tvImgv3.setVisibility(View.GONE);
        }
        if (countCardClick == 4) {
            activityTarotDiarioBinding.imgv4thCard.setImageResource(card.getImageResource());
            activityTarotDiarioBinding.tvImgv4.setVisibility(View.GONE);
        }
        if (countCardClick == 5) {
            activityTarotDiarioBinding.imgv5thCard.setImageResource(card.getImageResource());
            activityTarotDiarioBinding.tvImgv5.setVisibility(View.GONE);
        }

        Toast.makeText(this, "Card " + card.getName(), Toast.LENGTH_SHORT).show();
    }
}