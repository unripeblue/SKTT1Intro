package com.seokyeong.the.sktt1intro;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.seokyeong.the.sktt1intro.data.Coach;

public class CoachProfileActivity extends BaseActivity {

    Coach mCoach = null;

    private android.widget.TextView nameTxt;
    private android.widget.TextView birthdayTxt;
    private android.widget.TextView nickNameTxt;
    private android.widget.TextView favoriteTxt;
    private android.widget.TextView specialTxt;
    private android.widget.TextView gameIdTxt;
    private android.widget.TextView useKeyboardTxt;
    private android.widget.TextView useMouseTxt;
    private android.widget.ImageView profilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_profile);
        mCoach = (Coach) getIntent().getSerializableExtra("코치정보");
        bindViews();
        setValues();
        setupEvents();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        nameTxt.setText(mCoach.getName());
        birthdayTxt.setText(mCoach.getBirthday());
        nickNameTxt.setText(mCoach.getNickname());
        favoriteTxt.setText(mCoach.getFavorite());
        specialTxt.setText(mCoach.getSpecial());
        gameIdTxt.setText(mCoach.getGameId());
        useKeyboardTxt.setText(mCoach.getKeyboard());
        useMouseTxt.setText(mCoach.getMouse());
        Glide.with(this).load(mCoach.getProfileImgURL()).into(profilePic);
    }

    @Override
    public void bindViews() {
        this.useMouseTxt = (TextView) findViewById(R.id.useMouseTxt);
        this.useKeyboardTxt = (TextView) findViewById(R.id.useKeyboardTxt);
        this.gameIdTxt = (TextView) findViewById(R.id.gameIdTxt);
        this.specialTxt = (TextView) findViewById(R.id.specialTxt);
        this.favoriteTxt = (TextView) findViewById(R.id.favoriteTxt);
        this.nickNameTxt = (TextView) findViewById(R.id.nickNameTxt);
        this.birthdayTxt = (TextView) findViewById(R.id.birthdayTxt);
        this.nameTxt = (TextView) findViewById(R.id.nameTxt);
        this.profilePic = (ImageView) findViewById(R.id.profilePic);
    }
}
