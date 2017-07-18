package com.wx.designmodel.prototypepattern;

/**
 * @Author: Wells.Wei
 * @Date: 2017/5/2
 * @Description:
 */
class A implements Cloneable{
    private String s1;
    private String s2;

    public A(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }


    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    @Override
    public String toString(){
        return "s1="+s1 +" s2="+s2;
    }

    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
