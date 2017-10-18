package com.example.the.sktt1intro.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.the.sktt1intro.R;

/**
 * Created by the on 2017-10-16.
 */

public class PlayerIntroduceFragment extends Fragment {


    private android.widget.Button headCoachBtn;
    private android.widget.Button coachBtn1;
    private android.widget.Button coachBtn2;
    private ImageView top1;
    private ImageView mid1;
    private ImageView jungle1;
    private ImageView adc;
    private ImageView top2;
    private ImageView mid2;
    private ImageView jungle2;
    private ImageView sup;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_playerintroduce, container, false);
        this.sup = (ImageView) view.findViewById(R.id.sup);
        this.jungle2 = (ImageView) view.findViewById(R.id.jungle2);
        this.mid2 = (ImageView) view.findViewById(R.id.mid2);
        this.top2 = (ImageView) view.findViewById(R.id.top2);
        this.adc = (ImageView) view.findViewById(R.id.adc);
        this.jungle1 = (ImageView) view.findViewById(R.id.jungle1);
        this.mid1 = (ImageView) view.findViewById(R.id.mid1);
        this.top1 = (ImageView) view.findViewById(R.id.top1);
        this.coachBtn2 = (Button) view.findViewById(R.id.coachBtn2);
        this.coachBtn1 = (Button) view.findViewById(R.id.coachBtn1);
        this.headCoachBtn = (Button) view.findViewById(R.id.headCoachBtn);
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

    }


}
