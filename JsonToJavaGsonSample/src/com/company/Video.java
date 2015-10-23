package com.company;

import java.util.Date;


public class Video{

    private static final String FIELD_DURATION = "duration";
    private static final String FIELD_HIGH = "high";
    private static final String FIELD_LOW = "low";


    private int duration;
    private String high;
    private String low;


    public Video(){

    }

    public void set_duration(int duration) {
        duration = duration;
    }

    public int get_duration() {
        return duration;
    }

    public void set_high(String high) {
        high = high;
    }

    public String get_high() {
        return high;
    }

    public void set_low(String low) {
        low = low;
    }

    public String get_low() {
        return low;
    }

    @Override
    public String toString(){
        return "duration = " + duration + ", high = " + high + ", low = " + low;
    }


}