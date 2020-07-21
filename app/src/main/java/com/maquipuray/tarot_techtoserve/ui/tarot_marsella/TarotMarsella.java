package com.maquipuray.tarot_techtoserve.ui.tarot_marsella;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.maquipuray.tarot_techtoserve.R;
import com.maquipuray.tarot_techtoserve.ui.tarot_diario.TarotDiarioActivity;

public class TarotMarsella extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarot_marsella);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        LinearLayout ll_elcamino = findViewById(R.id.ll_elcamino);
        ll_elcamino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TarotMarsella.this, TarotDiarioActivity.class));
            }
        });
    }

    public void clicKBackNavigation(View view) {
        Toast.makeText(this, "Click Back", Toast.LENGTH_SHORT).show();
    }
}