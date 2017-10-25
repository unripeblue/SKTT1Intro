package com.seokyeong.the.sktt1intro.data;

import java.io.Serializable;

/**
 * Created by the on 2017-10-25.
 */

public class Game implements Serializable {

    private String day;
    private String time;
    private String location;
    private int skScore;
    private int awayTeamScore;
    private String awayTeamName;

    public Game() {
    }

    public Game(String day, String time, String location, int skScore, int awayTeamScore, String awayTeamName) {
        this.day = day;
        this.time = time;
        this.location = location;
        this.skScore = skScore;
        this.awayTeamScore = awayTeamScore;
        this.awayTeamName = awayTeamName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSkScore() {
        return skScore;
    }

    public void setSkScore(int skScore) {
        this.skScore = skScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }
}
