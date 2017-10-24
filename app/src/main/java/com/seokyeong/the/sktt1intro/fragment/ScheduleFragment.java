package com.seokyeong.the.sktt1intro.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.spans.DotSpan;
import com.seokyeong.the.sktt1intro.GameResultActivity;
import com.seokyeong.the.sktt1intro.R;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by the on 2017-10-16.
 */

public class ScheduleFragment extends Fragment {

    private com.prolificinteractive.materialcalendarview.MaterialCalendarView calendarView;
    private android.widget.ImageView leftwinImg;
    private android.widget.ImageView rightwinImg;
    private android.widget.LinearLayout detailViewLout;
    private android.widget.LinearLayout noGameLout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_schedule, container, false);
        this.noGameLout = (LinearLayout) view.findViewById(R.id.noGameLout);
        this.detailViewLout = (LinearLayout) view.findViewById(R.id.detailViewLout);
        this.rightwinImg = (ImageView) view.findViewById(R.id.rightwinImg);
        this.leftwinImg = (ImageView) view.findViewById(R.id.leftwinImg);
        this.calendarView = (MaterialCalendarView) view.findViewById(R.id.calendarView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();

    }

    private void setupEvents() {
        detailViewLout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GameResultActivity.class);
                startActivity(intent);
            }
        });

    }

    private void setValues() {
        calendarView.addDecorators(
                new SundayDecorator(),
                new SaturdayDecorator());


    }

    public class EventDecorator implements DayViewDecorator {

        private final int color;
        private final HashSet<CalendarDay> dates;

        public EventDecorator(int color, Collection<CalendarDay> dates) {
            this.color = color;
            this.dates = new HashSet<>(dates);
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            return dates.contains(day);
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new DotSpan(5, color));
        }
    }

    public class SundayDecorator implements DayViewDecorator {

        private final Calendar calendar = Calendar.getInstance();

        public SundayDecorator() {
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            day.copyTo(calendar);
            int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
            return weekDay == Calendar.SUNDAY;
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new ForegroundColorSpan(Color.RED));
        }
    }

    public class SaturdayDecorator implements DayViewDecorator {

        private final Calendar calendar = Calendar.getInstance();

        public SaturdayDecorator() {
        }

        @Override
        public boolean shouldDecorate(CalendarDay day) {
            day.copyTo(calendar);
            int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
            return weekDay == Calendar.SATURDAY;
        }

        @Override
        public void decorate(DayViewFacade view) {
            view.addSpan(new ForegroundColorSpan(Color.BLUE));
        }
    }


}
