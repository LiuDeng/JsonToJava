package com.company;

import com.google.gson.annotations.SerializedName;


public class Video{

    private static final String FIELD_DURATION = "duration";
    private static final String FIELD_HIGH = "high";
    private static final String FIELD_LOW = "low";


    @SerializedName(FIELD_DURATION)
    private int mDuration;
    @SerializedName(FIELD_HIGH)
    private String mHigh;
    @SerializedName(FIELD_LOW)
    private String mLow;


    public Video(){

    }

    public void setDuration(int duration) {
        mDuration = duration;
    }

    public int getDuration() {
        return mDuration;
    }

    public void setHigh(String high) {
        mHigh = high;
    }

    public String getHigh() {
        return mHigh;
    }

    public void setLow(String low) {
        mLow = low;
    }

    public String getLow() {
        return mLow;
    }


}