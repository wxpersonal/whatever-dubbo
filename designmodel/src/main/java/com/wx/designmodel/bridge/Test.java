package com.wx.designmodel.bridge;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Test {

    public static void main(String[] args) {
        AbstractRoad speedWay = new SpeedWay();
        speedWay.car = new Car();
        speedWay.run();

        AbstractRoad street = new Street();
        street.car = new Bus();
        street.run();
    }
}
