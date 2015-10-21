package com.example.api.model;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class File implements Parcelable{

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

    public File(Parcel in) {
        mHeight = in.readInt();
        mSmall = in.readString();
        mLarge = in.readString();
        mIsGif = in.readInt() == 1 ? true: false;
        mWidth = in.readInt();
        mVideo = in.readParcelable(Video.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<File> CREATOR = new Parcelable.Creator<File>() {
        public File createFromParcel(Parcel in) {
            return new File(in);
        }

        public File[] newArray(int size) {
        return new File[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mHeight);
        dest.writeString(mSmall);
        dest.writeString(mLarge);
        dest.writeInt(mIsGif ? 1 : 0);
        dest.writeInt(mWidth);
        dest.writeParcelable(mVideo, flags);
    }


}