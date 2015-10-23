package com.company;

import java.util.Date;


public class User{

    private static final String FIELD_SEX = "sex";
    private static final String FIELD_DESC = "desc";
    private static final String FIELD__ID = "_id";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_AVATAR = "avatar";


    private int sex;
    private String desc;
    private Long _id;
    private String name;
    private String avatar;


    public User(){

    }

    public void set_sex(int sex) {
        sex = sex;
    }

    public int get_sex() {
        return sex;
    }

    public void set_desc(String desc) {
        desc = desc;
    }

    public String get_desc() {
        return desc;
    }

    public void set__id(Long _id) {
        _id = _id;
    }

    public Long get__id() {
        return _id;
    }

    public void set_name(String name) {
        name = name;
    }

    public String get_name() {
        return name;
    }

    public void set_avatar(String avatar) {
        avatar = avatar;
    }

    public String get_avatar() {
        return avatar;
    }

    @Override
    public String toString(){
        return "sex = " + sex + ", desc = " + desc + ", _id = " + _id + ", name = " + name + ", avatar = " + avatar;
    }


}