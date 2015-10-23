package com.company;

import java.util.Date;


public class God{

    private static final String FIELD_T = "T";
    private static final String FIELD_TEXT = "text";
    private static final String FIELD_LIKE_C = "likeC";
    private static final String FIELD__ID = "_id";
    private static final String FIELD_JOKE = "joke";
    private static final String FIELD_BURY_C = "buryC";
    private static final String FIELD_USER = "user";


    private Date T;
    private String text;
    private int likeC;
    private Long _id;
    private Long joke;
    private int buryC;
    private User user;


    public God(){

    }

    public void set_T(Date T) {
        T = T;
    }

    public Date get_T() {
        return T;
    }

    public void set_text(String text) {
        text = text;
    }

    public String get_text() {
        return text;
    }

    public void set_likeC(int likeC) {
        likeC = likeC;
    }

    public int get_likeC() {
        return likeC;
    }

    public void set__id(Long _id) {
        _id = _id;
    }

    public Long get__id() {
        return _id;
    }

    public void set_joke(Long joke) {
        joke = joke;
    }

    public Long get_joke() {
        return joke;
    }

    public void set_buryC(int buryC) {
        buryC = buryC;
    }

    public int get_buryC() {
        return buryC;
    }

    public void set_user(User user) {
        user = user;
    }

    public User get_user() {
        return user;
    }

    @Override
    public String toString(){
        return "T = " + T + ", text = " + text + ", likeC = " + likeC + ", _id = " + _id + ", joke = " + joke + ", buryC = " + buryC + ", user = " + user;
    }


}