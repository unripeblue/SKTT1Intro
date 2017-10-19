package com.seokyeong.the.sktt1intro.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.seokyeong.the.sktt1intro.R;
import com.seokyeong.the.sktt1intro.miniactivity.EmblemActivity;
import com.seokyeong.the.sktt1intro.miniactivity.FightsongActivity;
import com.seokyeong.the.sktt1intro.miniactivity.SponsorActivity;

/**
 * Created by the on 2017-10-16.
 */

public class TeamIntroduceFragment extends Fragment{


    private LinearLayout searchBtn1;
    private LinearLayout searchBtn2;
    private LinearLayout searchBtn3;
    private LinearLayout searchBtn4;
    private android.widget.ImageView introMain;
    private LinearLayout history;
    private LinearLayout emblem;
    private LinearLayout fightsong;
    private LinearLayout sponsor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_teamintroduce, container, false);
        this.sponsor = (LinearLayout) view.findViewById(R.id.sponsor);
        this.fightsong = (LinearLayout) view.findViewById(R.id.fightsong);
        this.emblem = (LinearLayout) view.findViewById(R.id.emblem);
        this.history = (LinearLayout) view.findViewById(R.id.history);
        this.introMain = (ImageView) view.findViewById(R.id.introMain);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        Glide.with(this).load("http://www.sksports.net/IMG/T1/contents/img_t1about.jpg?160108").into(introMain);

    }

    private void setupEvents() {
        sponsor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SponsorActivity.class);
                startActivity(intent);
            }
        });
        fightsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FightsongActivity.class);
                startActivity(intent);
            }
        });
        emblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EmblemActivity.class);
                startActivity(intent);
            }
        });

    }
}
