package com.example.qube.gitworkflow;

/**
 * Created by ander on 8/10/2016.
 */
public class Actor {

    private String mTop;
    private String mMiddle;
    private String mBottom;

    public String getmTop() {
        return mTop;
    }

    public void setmTop(String mTop) {
        this.mTop = mTop;
    }

    public String getmMiddle() {
        return mMiddle;
    }

    public void setmMiddle(String mMiddle) {
        this.mMiddle = mMiddle;
    }

    public String getmBottom() {
        return mBottom;
    }

    public void setmBottom(String mBottom) {
        this.mBottom = mBottom;
    }

    public Actor(String top, String middle, String bottom){
        mTop = top;
        mMiddle = middle;
        mBottom = bottom;
    }
}
