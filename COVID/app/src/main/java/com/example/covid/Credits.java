package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Credits extends AppCompatActivity {
    AdView mAdView;

    String sourse="https://www.covidvisualizer.com";
    String details="This website was developed by Navid Mamoon and Gabriel Rasskin, two students at Carnegie Mellon University.";

    TextView sourseTextView,credits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        sourseTextView= findViewById(R.id.txtSourse);
        credits = findViewById(R.id.txtCredits);
        sourseTextView.setText("Sourse: "+sourse);
        credits.setText(details);
    }
}
