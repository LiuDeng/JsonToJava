package com.company;

import com.google.gson.annotations.SerializedName;


public class Folder{

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


}