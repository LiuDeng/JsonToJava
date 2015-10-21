package com.company;

import com.google.gson.annotations.SerializedName;


public class T{

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


}