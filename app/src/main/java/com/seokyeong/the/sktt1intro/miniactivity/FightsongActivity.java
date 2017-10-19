package com.seokyeong.the.sktt1intro.miniactivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.seokyeong.the.sktt1intro.BaseActivity;
import com.seokyeong.the.sktt1intro.R;

public class FightsongActivity extends BaseActivity {

    private android.widget.ImageView winnerT1;
    private android.widget.ImageView t1lysic;
    private ImageView tempimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fightsong);
        this.t1lysic = (ImageView) findViewById(R.id.t1lysic);
        this.tempimg = (ImageView) findViewById(R.id.tempimg);
        this.winnerT1 = (ImageView) findViewById(R.id.winnerT1);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/txt_song3.jpg").into(t1lysic);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/txt_song2.gif").into(tempimg);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/pic_songbar.jpg").into(winnerT1);
    }

    @Override
    public void bindViews() {
        this.t1lysic = (ImageView) findViewById(R.id.t1lysic);
        this.winnerT1 = (ImageView) findViewById(R.id.winnerT1);
    }
}
