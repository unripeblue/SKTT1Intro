package com.seokyeong.the.sktt1intro.miniactivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.seokyeong.the.sktt1intro.BaseActivity;
import com.seokyeong.the.sktt1intro.R;

public class SponsorActivity extends BaseActivity {

    private android.widget.ImageView douyu;
    private android.widget.ImageView twitch;
    private android.widget.ImageView asus;
    private android.widget.ImageView essencore;
    private android.widget.ImageView razer;
    private android.widget.ImageView donga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsor);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img10_abosp1.jpg").into(douyu);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img11_abosp1.jpg").into(twitch);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img13_abosp1.jpg").into(asus);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img12_abosp1.jpg?170411").into(essencore);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img07_abosp1.jpg").into(razer);
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img02_abosp1.jpg").into(donga);
    }

    @Override
    public void bindViews() {
        this.donga = (ImageView) findViewById(R.id.donga);
        this.razer = (ImageView) findViewById(R.id.razer);
        this.essencore = (ImageView) findViewById(R.id.essencore);
        this.asus = (ImageView) findViewById(R.id.asus);
        this.twitch = (ImageView) findViewById(R.id.twitch);
        this.douyu = (ImageView) findViewById(R.id.douyu);
    }
}
