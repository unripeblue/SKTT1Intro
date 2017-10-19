package com.seokyeong.the.sktt1intro;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.seokyeong.the.sktt1intro.data.Player;

public class PlayerProfileActivity extends BaseActivity {

    Player mPlayer = null;

    private android.widget.TextView nameTxt;
    private android.widget.TextView birthdayTxt;
    private android.widget.TextView favoriteTxt;
    private android.widget.TextView gameIdTxt;
    private android.widget.TextView positionTxt;
    private android.widget.TextView bestChampTxt;
    private android.widget.TextView useKeyboardTxt;
    private android.widget.TextView useMouseTxt;
    private android.widget.ImageView profilePic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_profile);
        mPlayer = (Player) getIntent().getSerializableExtra("플레이어정보");
        bindViews();
        setValues();
        setupEvents();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        nameTxt.setText(mPlayer.getName());
        birthdayTxt.setText(mPlayer.getBirthday());
        favoriteTxt.setText(mPlayer.getFavorite());
        gameIdTxt.setText(mPlayer.getGameId());
        positionTxt.setText(mPlayer.getPosition());
        bestChampTxt.setText(mPlayer.getBestChamp());
        useKeyboardTxt.setText(mPlayer.getKeyboard());
        useMouseTxt.setText(mPlayer.getMouse());
        Glide.with(this).load(mPlayer.getProfileImgURL()).into(profilePic);
    }

    @Override
    public void bindViews() {
        this.useMouseTxt = (TextView) findViewById(R.id.useMouseTxt);
        this.useKeyboardTxt = (TextView) findViewById(R.id.useKeyboardTxt);
        this.bestChampTxt = (TextView) findViewById(R.id.bestChampTxt);
        this.positionTxt = (TextView) findViewById(R.id.positionTxt);
        this.gameIdTxt = (TextView) findViewById(R.id.gameIdTxt);
        this.favoriteTxt = (TextView) findViewById(R.id.favoriteTxt);
        this.birthdayTxt = (TextView) findViewById(R.id.birthdayTxt);
        this.nameTxt = (TextView) findViewById(R.id.nameTxt);
        this.profilePic = (ImageView) findViewById(R.id.profilePic);
    }
}
