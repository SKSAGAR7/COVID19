package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Devoloper extends AppCompatActivity {
    AdView mAdView;

    TextView intro,collect;
    String introtext="Hi I am Sagar \n The goal of this project is to provide a simple, interactive way to visualize the impact of COVID-19." +
            " I want people able to see this as something that brings us all together. It's not one country, or another country; " +
            "it's one planet – and this is what our planet looks like today."
            ;
    String info="The data is from Worldometer's real-time updates, utilizing reliable sources from around the world. The TODAY cases/deaths are based on GMT (+0). " +
            "The website pulls new data every 2 minutes, refresh to see any changes.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devoloper);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        intro = findViewById(R.id.txtIntro);
        intro.setText(introtext);

        collect = findViewById(R.id.txtCollect);
        collect.setText("Note: "+info);
    }
}
