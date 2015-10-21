package com.example.api.model;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class God implements Parcelable{





    public God(){

    }

    public God(Parcel in) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<God> CREATOR = new Parcelable.Creator<God>() {
        public God createFromParcel(Parcel in) {
            return new God(in);
        }

        public God[] newArray(int size) {
        return new God[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }


}