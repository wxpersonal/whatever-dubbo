package com.wx.designmodel.adapter;


/**
 * @Author: Wells.Wei
 * @Date: 2017/5/2
 * @Description:
 */
public class Test {

    public static void main(String[] args){

        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
        adapter.specificRequest();

    }
}


