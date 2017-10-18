package com.example.the.sktt1intro.data;

import java.io.Serializable;

/**
 * Created by the on 2017-10-18.
 */

public class Player implements Serializable {
    private int userId;
    private String name;
    private String birthday;
    private String favorite;
    private String gameId;
    private String position;
    private String bestChamp;
    private String keyboard;
    private String mouse;
    private String profileImgURL;

    public Player() {
    }

    public Player(int userId, String name, String birthday, String favorite, String gameId, String position, String bestChamp, String keyboard, String mouse, String profileImgURL) {
        this.userId = userId;
        this.name = name;
        this.birthday = birthday;
        this.favorite = favorite;
        this.gameId = gameId;
        this.position = position;
        this.bestChamp = bestChamp;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.profileImgURL = profileImgURL;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBestChamp() {
        return bestChamp;
    }

    public void setBestChamp(String bestChamp) {
        this.bestChamp = bestChamp;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getProfileImgURL() {
        return profileImgURL;
    }

    public void setProfileImgURL(String profileImgURL) {
        this.profileImgURL = profileImgURL;
    }
}
