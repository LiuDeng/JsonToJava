package com.example.api.model;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class T implements Parcelable{

    private static final String FIELD_$DATE = "$date";


    @SerializedName(FIELD_$DATE)
    private Long mDate;


    public T(){

    }

    public void setDate(Long date) {
        mDate = date;
    }

    public Long getDate() {
        return mDate;
    }

    public T(Parcel in) {
        mDate = in.readLong();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<T> CREATOR = new Parcelable.Creator<T>() {
        public T createFromParcel(Parcel in) {
            return new T(in);
        }

        public T[] newArray(int size) {
        return new T[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mDate);
    }


}