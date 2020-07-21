package com.maquipuray.tarot_techtoserve.ui.tarot_diario;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maquipuray.tarot_techtoserve.R;
import com.maquipuray.tarot_techtoserve.data.DataCards;

public class TarotDiarioActivity extends AppCompatActivity
        implements TarotAdapter.ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarot_diario);

        RecyclerView rv_ = findViewById(R.id.rv_list);
//        rv_.ad
        rv_.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rv_.setHasFixedSize(true);
        rv_.setAdapter(new TarotAdapter(DataCards.getCardsList(), this, this));
        rv_.setHasFixedSize(true);
    }

    @Override
    public void onItemClick(int position, ImageView view, DataCards card) {

        Toast.makeText(this, card.toString(), Toast.LENGTH_SHORT).show();
    }
}