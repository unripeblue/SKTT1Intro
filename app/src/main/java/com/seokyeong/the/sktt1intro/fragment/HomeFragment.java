package com.seokyeong.the.sktt1intro.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.seokyeong.the.sktt1intro.R;
import com.seokyeong.the.sktt1intro.adapter.BoardAdapter;
import com.seokyeong.the.sktt1intro.data.Board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by the on 2017-10-16.
 */

public class HomeFragment extends Fragment {
    List<Board> menuList = new ArrayList<>();
    BoardAdapter myBoardAdapter;
    private android.widget.ListView boardListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_home, container, false);
        this.boardListView = (ListView) view.findViewById(R.id.boardListView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {
        myBoardAdapter = new BoardAdapter(getActivity(), menuList);
        boardListView.setAdapter(myBoardAdapter);
    }

    private void setupEvents() {

    }

}
