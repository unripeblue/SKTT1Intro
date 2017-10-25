package com.seokyeong.the.sktt1intro.data;

import java.io.Serializable;

/**
 * Created by the on 2017-10-25.
 */

public class Board implements Serializable {

    private int postNum;
    private String postTitle;
    private int hitCount;
    private int recommend;

    public Board() {
    }

    public Board(int postNum, String postTitle, int hitCount, int recommend) {
        this.postNum = postNum;
        this.postTitle = postTitle;
        this.hitCount = hitCount;
        this.recommend = recommend;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }
}
