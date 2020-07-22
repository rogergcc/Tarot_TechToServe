package com.maquipuray.tarot_techtoserve.ui.tarot_marsella;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.maquipuray.tarot_techtoserve.databinding.ActivityTarotMarsellaBinding;
import com.maquipuray.tarot_techtoserve.ui.tarot_diario.TarotDiarioActivity;

public class TarotMarsella extends AppCompatActivity {

    ActivityTarotMarsellaBinding activityTarotMarsellaBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tarot_marsella);

        activityTarotMarsellaBinding = ActivityTarotMarsellaBinding.inflate(getLayoutInflater());

        View view = activityTarotMarsellaBinding.getRoot();
        setContentView(view);

//        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(activityTarotMarsellaBinding.toolbar);

        activityTarotMarsellaBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        activityTarotMarsellaBinding.llElcamino.setOnClickListener(new View.OnClickListener() {
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