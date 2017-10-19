package com.example.the.sktt1intro.fragment;

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
import com.example.the.sktt1intro.CoachProfileActivity;
import com.example.the.sktt1intro.PlayerProfileActivity;
import com.example.the.sktt1intro.R;
import com.example.the.sktt1intro.util.GlobalData;

/**
 * Created by the on 2017-10-16.
 */

public class PlayerIntroduceFragment extends Fragment {


    private LinearLayout coachBtn0;
    private LinearLayout coachBtn1;
    private LinearLayout coachBtn2;
    private ImageView top1;
    private ImageView mid1;
    private ImageView jungle1;
    private ImageView adc;
    private ImageView top2;
    private ImageView mid2;
    private ImageView jungle2;
    private ImageView sup;
    private LinearLayout top1Lout;
    private LinearLayout mid1Lout;
    private LinearLayout jungle1Lout;
    private LinearLayout adcLout;
    private LinearLayout top2Lout;
    private LinearLayout mid2Lout;
    private LinearLayout jungle2Lout;
    private LinearLayout supLout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_playerintroduce, container, false);
        this.coachBtn2 = (LinearLayout) view.findViewById(R.id.coachBtn2);
        this.coachBtn1 = (LinearLayout) view.findViewById(R.id.coachBtn1);
        this.coachBtn0 = (LinearLayout) view.findViewById(R.id.coachBtn0);
        this.supLout = (LinearLayout) view.findViewById(R.id.supLout);
        this.sup = (ImageView) view.findViewById(R.id.sup);
        this.jungle2Lout = (LinearLayout) view.findViewById(R.id.jungle2Lout);
        this.jungle2 = (ImageView) view.findViewById(R.id.jungle2);
        this.mid2Lout = (LinearLayout) view.findViewById(R.id.mid2Lout);
        this.mid2 = (ImageView) view.findViewById(R.id.mid2);
        this.top2Lout = (LinearLayout) view.findViewById(R.id.top2Lout);
        this.top2 = (ImageView) view.findViewById(R.id.top2);
        this.adcLout = (LinearLayout) view.findViewById(R.id.adcLout);
        this.adc = (ImageView) view.findViewById(R.id.adc);
        this.jungle1Lout = (LinearLayout) view.findViewById(R.id.jungle1Lout);
        this.jungle1 = (ImageView) view.findViewById(R.id.jungle1);
        this.mid1Lout = (LinearLayout) view.findViewById(R.id.mid1Lout);
        this.mid1 = (ImageView) view.findViewById(R.id.mid1);
        this.top1Lout = (LinearLayout) view.findViewById(R.id.top1Lout);
        this.top1 = (ImageView) view.findViewById(R.id.top1);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_top_hsh.png").into(top1);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_mid_lsh_111.png").into(mid1);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_jungle_ksg_1111.png").into(jungle1);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_ad_bjs_1111.png").into(adc);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_top_puj111.png").into(top2);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_mid_khn_1111.png").into(mid2);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_jungle_hwh.png").into(jungle2);
        Glide.with(this).load("http://www.sksports.net/Common/Attach/T1LOLPlayer/thum_support_ljw_111.png").into(sup);
        }

    private void setupEvents() {

        View.OnClickListener coachListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cNum = Integer.parseInt(view.getTag().toString());
                Intent intent = new Intent(getActivity(), CoachProfileActivity.class);
                intent.putExtra("코치정보", GlobalData.coachs.get(cNum));

                startActivity(intent);
            }
        };

        coachBtn0.setOnClickListener(coachListener);
        coachBtn1.setOnClickListener(coachListener);
        coachBtn2.setOnClickListener(coachListener);

        View.OnClickListener playerListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pNum = Integer.parseInt(view.getTag().toString());
                Intent intent = new Intent(getActivity(), PlayerProfileActivity.class);
                intent.putExtra("플레이어정보", GlobalData.players.get(pNum));

                startActivity(intent);
            }
        };

        top1Lout.setOnClickListener(playerListener);
        mid1Lout.setOnClickListener(playerListener);
        jungle1Lout.setOnClickListener(playerListener);
        adcLout.setOnClickListener(playerListener);
        top2Lout.setOnClickListener(playerListener);
        mid2Lout.setOnClickListener(playerListener);
        jungle2Lout.setOnClickListener(playerListener);
        supLout.setOnClickListener(playerListener);

    }


}
