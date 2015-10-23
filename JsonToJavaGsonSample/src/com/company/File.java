package com.company;

import java.util.Date;


public class File{

    private static final String FIELD_HEIGHT = "height";
    private static final String FIELD_IS_GIF = "isGif";
    private static final String FIELD_WIDTH = "width";
    private static final String FIELD_SMALL = "small";
    private static final String FIELD_LARGE = "large";
    private static final String FIELD_VIDEO = "video";


    private int height;
    private boolean isGif;
    private int width;
    private String small;
    private String large;
    private Video video;


    public File(){

    }

    public void set_height(int height) {
        height = height;
    }

    public int get_height() {
        return height;
    }

    public void set_isGif(boolean isGif) {
        isGif = isGif;
    }

    public boolean isisGif() {
        return isGif;
    }

    public void set_width(int width) {
        width = width;
    }

    public int get_width() {
        return width;
    }

    public void set_small(String small) {
        small = small;
    }

    public String get_small() {
        return small;
    }

    public void set_large(String large) {
        large = large;
    }

    public String get_large() {
        return large;
    }

    public void set_video(Video video) {
        video = video;
    }

    public Video get_video() {
        return video;
    }

    @Override
    public String toString(){
        return "height = " + height + ", isGif = " + isGif + ", width = " + width + ", small = " + small + ", large = " + large + ", video = " + video;
    }


}