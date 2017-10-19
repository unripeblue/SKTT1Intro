package com.seokyeong.the.sktt1intro.miniactivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;

import com.seokyeong.the.sktt1intro.BaseActivity;
import com.seokyeong.the.sktt1intro.R;

public class EmblemActivity extends BaseActivity {

    private android.widget.TabWidget tabs;
    private android.widget.ImageView emblem;
    private android.widget.ImageView logo;
    private android.widget.LinearLayout tab1;
    private android.widget.ImageView mascot;
    private android.widget.LinearLayout tab2;
    private android.widget.FrameLayout tabcontent;
    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emblem);
        bindViews();
        makeTabHost();
        setValues();
        setupEvents();
    }

    private void makeTabHost() {
        tabHost.setup();

        TabHost.TabSpec ts1 = tabHost.newTabSpec("tab1").setIndicator("엠블렘");
        ts1.setContent(R.id.tab1);
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("tab2").setIndicator("마스코트");
        ts2.setContent(R.id.tab2);
        tabHost.addTab(ts2);
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.tabHost = (TabHost) findViewById(R.id.tabHost);
        this.tab2 = (LinearLayout) findViewById(R.id.tab2);
        this.tab1 = (LinearLayout) findViewById(R.id.tab1);
        this.tabs = (TabWidget) findViewById(android.R.id.tabs);
    }
}
