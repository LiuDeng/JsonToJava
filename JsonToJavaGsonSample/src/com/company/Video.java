package com.example.api.model;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class Video implements Parcelable{

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

    public Video(Parcel in) {
        mDuration = in.readInt();
        mHigh = in.readString();
        mLow = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() {
        public Video createFromParcel(Parcel in) {
            return new Video(in);
        }

        public Video[] newArray(int size) {
        return new Video[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mDuration);
        dest.writeString(mHigh);
        dest.writeString(mLow);
    }


}