package com.seokyeong.the.sktt1intro.data;

import java.io.Serializable;

/**
 * Created by the on 2017-10-18.
 */

public class Coach implements Serializable {
    private int userId;
    private String name;
    private String birthday;
    private String nickname;
    private String favorite;
    private String special;
    private String gameId;
    private String keyboard;
    private String mouse;
    private String profileImgURL;

    public Coach() {
    }

    public Coach(int userId, String name, String birthday, String nickname, String favorite, String special, String gameId, String keyboard, String mouse, String profileImgURL) {
        this.userId = userId;
        this.name = name;
        this.birthday = birthday;
        this.nickname = nickname;
        this.favorite = favorite;
        this.special = special;
        this.gameId = gameId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
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
