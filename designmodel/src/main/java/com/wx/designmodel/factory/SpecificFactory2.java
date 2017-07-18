package com.wx.designmodel.factory;

import com.wx.designmodel.factory.model.Model5;
import com.wx.designmodel.factory.model.Model6;
import com.wx.designmodel.factory.model.SpeciaficModel5_2;
import com.wx.designmodel.factory.model.SpeciaficModel6_2;

/**
 * @Author: Wells.Wei
 * @Date: 2017/4/24
 * @Description:
 */
public class SpecificFactory2 implements AbstractFactory{

    @Override
    public Model5 getModel5() {
        return new SpeciaficModel5_2() ;
    }

    @Override
    public Model6 getModel6() {
        return new SpeciaficModel6_2() ;
    }
}
