package com.seokyeong.the.sktt1intro.data;

/**
 * Created by the on 2017-10-25.
 */

public class User {
    private int id;
    private String userId;
    private String userName;
    private String userBirthday;
    private int profilePicNum;

    public User() {
    }

    public User(int id, String userId, String userName, String userBirthday, int profilePicNum) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userBirthday = userBirthday;
        this.profilePicNum = profilePicNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public int getProfilePicNum() {
        return profilePicNum;
    }

    public void setProfilePicNum(int profilePicNum) {
        this.profilePicNum = profilePicNum;
    }
}
