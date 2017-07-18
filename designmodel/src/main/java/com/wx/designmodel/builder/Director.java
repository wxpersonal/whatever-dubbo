package com.wx.designmodel.builder;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
