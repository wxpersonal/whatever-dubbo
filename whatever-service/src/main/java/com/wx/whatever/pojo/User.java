package com.wx.whatever.pojo;

import java.util.Date;

public class User {
    private Long userid;

    private String username;

    private String password;

    private Long gender;

    private String mobile;

    private Date registertime;

    private Date birthday;

    private String email;

    private String area;

    private Long photoid;

    private Long status;

    public User(Long userid, String username, String password, Long gender, String mobile, Date registertime, Date birthday, String email, String area, Long photoid, Long status) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.mobile = mobile;
        this.registertime = registertime;
        this.birthday = birthday;
        this.email = email;
        this.area = area;
        this.photoid = photoid;
        this.status = status;
    }

    public User() {
        super();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Long getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Long photoid) {
        this.photoid = photoid;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}