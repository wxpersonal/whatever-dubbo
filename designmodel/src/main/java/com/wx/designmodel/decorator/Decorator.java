package com.wx.designmodel.decorator;

/**
 * @Author: Wells.Wei
 * @Date: 2017/5/6
 * @Description: 装饰着
 */
public class Decorator implements Human {

    private Human human;
    public Decorator(Human human) {
        this.human = human;
    }
    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walk() {
        human.walk();
    }
}
