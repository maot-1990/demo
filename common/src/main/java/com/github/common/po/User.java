package com.github.common.po;

import com.github.common.annotation.Ignore;
import com.github.common.base.AbstractBean;

public class User extends AbstractBean {

    @Ignore
    private String id;
    private String userName;
    private String sex;
    private Integer age;
    private static String country = "CHINA";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        User.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
