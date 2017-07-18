package com.wx.designmodel.factory;

/**
 * @Author: Wells.Wei
 * @Date: 2017/4/24
 * @Description:
 */

import com.wx.designmodel.factory.model.Model1;
import com.wx.designmodel.factory.model.Model2;

/**
 * 简单工厂
 */
public class SimpleFactory{

    public Object create(Class<?> clazz){

        if(clazz.getName().equals(Model1.class.getName())){
            return new Model1();
        }

        if(clazz.getName().equals(Model2.class.getName())){
            return new Model2();
        }

        return null;
    }

}
