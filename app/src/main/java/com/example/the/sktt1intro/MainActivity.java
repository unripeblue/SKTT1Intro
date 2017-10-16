package com.example.the.sktt1intro;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {

    private LinearLayout homeFragmentLayout;
    private LinearLayout scheduleFragmentLayout;
    private LinearLayout teamIntroduceLayout;
    private LinearLayout playerIntroduceLayout;
    private LinearLayout homeBtn;
    private LinearLayout scheduleBtn;
    private LinearLayout teamintroBtn;
    private LinearLayout playerintroBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {
        final LinearLayout[] frags = {homeFragmentLayout, scheduleFragmentLayout,
                teamIntroduceLayout, playerIntroduceLayout};

        View.OnClickListener tabListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (LinearLayout linearLayout : frags) {
                    linearLayout.setVisibility(View.GONE);
                }

                int index = Integer.parseInt(v.getTag().toString());

                frags[index].setVisibility(View.VISIBLE);

            }
        };

        homeBtn.setOnClickListener(tabListner);
        scheduleBtn.setOnClickListener(tabListner);
        teamintroBtn.setOnClickListener(tabListner);
        playerintroBtn.setOnClickListener(tabListner);

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.playerintroBtn = (LinearLayout) findViewById(R.id.playerintroBtn);
        this.teamintroBtn = (LinearLayout) findViewById(R.id.teamintroBtn);
        this.scheduleBtn = (LinearLayout) findViewById(R.id.scheduleBtn);
        this.homeBtn = (LinearLayout) findViewById(R.id.homeBtn);
        this.playerIntroduceLayout = (LinearLayout) findViewById(R.id.playerIntroduceLayout);
        this.teamIntroduceLayout = (LinearLayout) findViewById(R.id.teamIntroduceLayout);
        this.scheduleFragmentLayout = (LinearLayout) findViewById(R.id.scheduleFragmentLayout);
        this.homeFragmentLayout = (LinearLayout) findViewById(R.id.homeFragmentLayout);
    }
}
