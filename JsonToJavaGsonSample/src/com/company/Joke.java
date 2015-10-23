package com.company;

import java.util.List;
import java.util.Date;


public class Joke{

    private static final String FIELD_T = "T";
    private static final String FIELD_COLLECT_C = "collectC";
    private static final String FIELD_TEXT = "text";
    private static final String FIELD_SHARE_C = "shareC";
    private static final String FIELD__ID = "_id";
    private static final String FIELD_LIKE_C = "likeC";
    private static final String FIELD_FILE = "file";
    private static final String FIELD_CMT_C = "cmtC";
    private static final String FIELD_PLAY_C = "playC";
    private static final String FIELD_BURY_C = "buryC";
    private static final String FIELD_GODS = "gods";
    private static final String FIELD_USER = "user";


    private Date T;
    private int collectC;
    private String text;
    private int shareC;
    private Long _id;
    private int likeC;
    private File file;
    private int cmtC;
    private int playC;
    private int buryC;
    private List<God> gods;
    private User user;


    public Joke(){

    }

    public void set_T(Date T) {
        T = T;
    }

    public Date get_T() {
        return T;
    }

    public void set_collectC(int collectC) {
        collectC = collectC;
    }

    public int get_collectC() {
        return collectC;
    }

    public void set_text(String text) {
        text = text;
    }

    public String get_text() {
        return text;
    }

    public void set_shareC(int shareC) {
        shareC = shareC;
    }

    public int get_shareC() {
        return shareC;
    }

    public void set__id(Long _id) {
        _id = _id;
    }

    public Long get__id() {
        return _id;
    }

    public void set_likeC(int likeC) {
        likeC = likeC;
    }

    public int get_likeC() {
        return likeC;
    }

    public void set_file(File file) {
        file = file;
    }

    public File get_file() {
        return file;
    }

    public void set_cmtC(int cmtC) {
        cmtC = cmtC;
    }

    public int get_cmtC() {
        return cmtC;
    }

    public void set_playC(int playC) {
        playC = playC;
    }

    public int get_playC() {
        return playC;
    }

    public void set_buryC(int buryC) {
        buryC = buryC;
    }

    public int get_buryC() {
        return buryC;
    }

    public void set_gods(List<God> gods) {
        gods = gods;
    }

    public List<God> get_gods() {
        return gods;
    }

    public void set_user(User user) {
        user = user;
    }

    public User get_user() {
        return user;
    }

    @Override
    public String toString(){
        return "T = " + T + ", collectC = " + collectC + ", text = " + text + ", shareC = " + shareC + ", _id = " + _id + ", likeC = " + likeC + ", file = " + file + ", cmtC = " + cmtC + ", playC = " + playC + ", buryC = " + buryC + ", gods = " + gods + ", user = " + user;
    }


}