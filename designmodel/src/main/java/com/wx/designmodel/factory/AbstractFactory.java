package com.wx.designmodel.factory;

import com.wx.designmodel.factory.model.Model5;
import com.wx.designmodel.factory.model.Model6;

/**
 * @Author: Wells.Wei
 * @Date: 2017/4/24
 * @Description:
 */
public interface AbstractFactory {

    public Model5 getModel5();

    public Model6 getModel6();
}
