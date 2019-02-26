package com.zafiproject.learningfirebase.admob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.MobileAds;
import com.zafiproject.learningfirebase.R;

public class RewardVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_video);
        MobileAds.initialize(this, "ca-app-pub-2257677873326732~1588023421");
    }
}
