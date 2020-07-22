package com.maquipuray.tarot_techtoserve.ui.tarot_diario;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.maquipuray.tarot_techtoserve.R;
import com.maquipuray.tarot_techtoserve.data.DataCards;
import com.maquipuray.tarot_techtoserve.databinding.ActivityResultBinding;
import com.maquipuray.tarot_techtoserve.ui.tarot_marsella.TarotMarsella;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding activityResultBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_result);

        activityResultBinding = ActivityResultBinding.inflate(getLayoutInflater());
        View view = activityResultBinding.getRoot();
        setContentView(view);

        setSupportActionBar(activityResultBinding.toolbar);


        activityResultBinding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, TarotMarsella.class));
//                finish();
            }
        });


        ArrayList<DataCards> result = getIntent().getParcelableArrayListExtra("data_result");


        if (result == null) {
            return;
        }


        activityResultBinding.tvResultTitle1.setText(result.get(0).getName().toUpperCase());
        activityResultBinding.imgvResultImage1.setImageResource(result.get(0).getImageResource());
//        activityResultBinding.tvResultDescription1.setText(result.get(0).getName() + "Description");

        activityResultBinding.tvResultTitle2.setText(result.get(1).getName().toUpperCase());
        activityResultBinding.imgvResultImage2.setImageResource(result.get(1).getImageResource());
//        activityResultBinding.tvResultDescription2.setText(result.get(1).getName() + "Description");

        activityResultBinding.tvResultTitle3.setText(result.get(2).getName().toUpperCase());
        activityResultBinding.imgvResultImage3.setImageResource(result.get(2).getImageResource());
//        activityResultBinding.tvResultDescription3.setText(result.get(2).getName() + "Description");

        activityResultBinding.tvResultTitle4.setText(result.get(3).getName().toUpperCase());
        activityResultBinding.imgvResultImage4.setImageResource(result.get(3).getImageResource());
//        activityResultBinding.tvResultDescription4.setText(result.get(3).getName() + "Description");

        activityResultBinding.tvResultTitle5.setText(result.get(4).getName().toUpperCase());
        activityResultBinding.imgvResultImage5.setImageResource(result.get(4).getImageResource());
//        activityResultBinding.tvResultDescription5.setText(result.get(4).getName() + "Description");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tarot_result_menu, menu);

        return true;
    }
}