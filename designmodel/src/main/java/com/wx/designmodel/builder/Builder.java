package com.wx.designmodel.builder;

/**
 * Created by Administrator on 2017/7/18.
 * 抽象建造者
 */
public interface Builder {

    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();
}
