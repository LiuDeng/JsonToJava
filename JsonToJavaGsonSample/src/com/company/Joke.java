package com.company;

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Joke{

    private static final String FIELD_FILE = "file";
    private static final String FIELD_TEXT = "text";
    private static final String FIELD_BURY_C = "buryC";
    private static final String FIELD_T = "T";
    private static final String FIELD_COLLECT_C = "collectC";
    private static final String FIELD_PLAY_C = "playC";
    private static final String FIELD_GODS = "gods";
    private static final String FIELD_USER = "user";
    private static final String FIELD_SHARE_C = "shareC";
    private static final String FIELD_LIKE_C = "likeC";
    private static final String FIELD__ID = "_id";
    private static final String FIELD_CMT_C = "cmtC";


    @SerializedName(FIELD_FILE)
    private File mFile;
    @SerializedName(FIELD_TEXT)
    private String mText;
    @SerializedName(FIELD_BURY_C)
    private int mBuryC;
    @SerializedName(FIELD_T)
    private T mT;
    @SerializedName(FIELD_COLLECT_C)
    private int mCollectC;
    @SerializedName(FIELD_PLAY_C)
    private int mPlayC;
    @SerializedName(FIELD_GODS)
    private List<God> mGods;
    @SerializedName(FIELD_USER)
    private Long mUser;
    @SerializedName(FIELD_SHARE_C)
    private int mShareC;
    @SerializedName(FIELD_LIKE_C)
    private int mLikeC;
    @SerializedName(FIELD__ID)
    private Long m_id;
    @SerializedName(FIELD_CMT_C)
    private int mCmtC;


    public Joke(){

    }

    public void setFile(File file) {
        mFile = file;
    }

    public File getFile() {
        return mFile;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }

    public void setBuryC(int buryC) {
        mBuryC = buryC;
    }

    public int getBuryC() {
        return mBuryC;
    }

    public void setT(T T) {
        mT = T;
    }

    public T getT() {
        return mT;
    }

    public void setCollectC(int collectC) {
        mCollectC = collectC;
    }

    public int getCollectC() {
        return mCollectC;
    }

    public void setPlayC(int playC) {
        mPlayC = playC;
    }

    public int getPlayC() {
        return mPlayC;
    }

    public void setGods(List<God> gods) {
        mGods = gods;
    }

    public List<God> getGods() {
        return mGods;
    }

    public void setUser(Long user) {
        mUser = user;
    }

    public Long getUser() {
        return mUser;
    }

    public void setShareC(int shareC) {
        mShareC = shareC;
    }

    public int getShareC() {
        return mShareC;
    }

    public void setLikeC(int likeC) {
        mLikeC = likeC;
    }

    public int getLikeC() {
        return mLikeC;
    }

    public void set_id(Long _id) {
        m_id = _id;
    }

    public Long get_id() {
        return m_id;
    }

    public void setCmtC(int cmtC) {
        mCmtC = cmtC;
    }

    public int getCmtC() {
        return mCmtC;
    }


}