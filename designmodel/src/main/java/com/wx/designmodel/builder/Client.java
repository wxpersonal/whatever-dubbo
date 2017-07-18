package com.wx.designmodel.builder;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new BuilderImpl();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1() + "   " + product.getPart2());
    }
}
