package com.wx.designmodel.prototypepattern;

/**
 * @Author: Wells.Wei
 * @Date: 2017/4/25
 * @Description: 浅拷贝
 */
public class ShallowClone implements Cloneable{

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object clone(){

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
