package com.wx.whatever.config;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 自定义的JSON转换MAPPER
 * 默认date返回datetime为long型时间戳，这里将格式定义为yyyy-MM-dd HH:mm:ss
 * 将null的参数转为空字符串
 * 全局配置，但不会覆盖使用注解的字段
 */
public class CustomObjectMapper extends ObjectMapper {

    public CustomObjectMapper(){
        super();
        //设置null转换""
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
                jg.writeString("");
            }
        });
        //设置日期转换yyyy-MM-dd HH:mm:ss
        setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
}
