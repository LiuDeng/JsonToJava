package com.example.api.model;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import android.os.Parcel;


public class Folder implements Parcelable{

    private static final String FIELD_JOKE = "Joke";


    @SerializedName(FIELD_JOKE)
    private Joke mJoke;


    public Folder(){

    }

    public void setJoke(Joke joke) {
        mJoke = joke;
    }

    public Joke getJoke() {
        return mJoke;
    }

    public Folder(Parcel in) {
        mJoke = in.readParcelable(Joke.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<Folder> CREATOR = new Parcelable.Creator<Folder>() {
        public Folder createFromParcel(Parcel in) {
            return new Folder(in);
        }

        public Folder[] newArray(int size) {
        return new Folder[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(mJoke, flags);
    }


}