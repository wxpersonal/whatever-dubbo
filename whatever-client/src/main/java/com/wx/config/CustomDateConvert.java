package com.wx.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 全局日期处理类（convert不适用RequestBody）
 * 用于解决controller接收参数，存在date属性无法正确解析，无法解析会报400错误
 */
public class CustomDateConvert implements Converter<String, Date> {

    @Override
    public Date convert(String stringDate) {
        SimpleDateFormat simpleDateFormat = null;

        //yyyy-MM-dd格式
        if(stringDate.length() >= 10 && stringDate.length() < 19)
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //yyyy-MM-dd格式
        if(stringDate.length() >= 19)
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
