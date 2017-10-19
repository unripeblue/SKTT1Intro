package com.example.the.sktt1intro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.the.sktt1intro.util.GlobalData;

public class LoginActivity extends BaseActivity {

    private android.widget.ImageView loginImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        loginImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    public void setValues() {
        GlobalData.initGlobalData();
    }

    @Override
    public void bindViews() {
        this.loginImg = (ImageView) findViewById(R.id.loginImg);
    }
}
