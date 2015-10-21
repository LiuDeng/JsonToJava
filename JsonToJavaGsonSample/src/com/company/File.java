package com.company;

import com.google.gson.annotations.SerializedName;


public class File{

    private static final String FIELD_HEIGHT = "height";
    private static final String FIELD_SMALL = "small";
    private static final String FIELD_LARGE = "large";
    private static final String FIELD_IS_GIF = "isGif";
    private static final String FIELD_WIDTH = "width";
    private static final String FIELD_VIDEO = "video";


    @SerializedName(FIELD_HEIGHT)
    private int mHeight;
    @SerializedName(FIELD_SMALL)
    private String mSmall;
    @SerializedName(FIELD_LARGE)
    private String mLarge;
    @SerializedName(FIELD_IS_GIF)
    private boolean mIsGif;
    @SerializedName(FIELD_WIDTH)
    private int mWidth;
    @SerializedName(FIELD_VIDEO)
    private Video mVideo;


    public File(){

    }

    public void setHeight(int height) {
        mHeight = height;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setSmall(String small) {
        mSmall = small;
    }

    public String getSmall() {
        return mSmall;
    }

    public void setLarge(String large) {
        mLarge = large;
    }

    public String getLarge() {
        return mLarge;
    }

    public void setIsGif(boolean isGif) {
        mIsGif = isGif;
    }

    public boolean isIsGif() {
        return mIsGif;
    }

    public void setWidth(int width) {
        mWidth = width;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setVideo(Video video) {
        mVideo = video;
    }

    public Video getVideo() {
        return mVideo;
    }


}