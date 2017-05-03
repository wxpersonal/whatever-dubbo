package com.wx.whatever.dao;

import com.wx.whatever.pojo.SystemCode;

import java.util.List;

public interface SystemCodeMapper {
    int deleteByPrimaryKey(String code);

    int insert(SystemCode record);

    int insertSelective(SystemCode record);

    SystemCode selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(SystemCode record);

    int updateByPrimaryKey(SystemCode record);

    List<SystemCode> list();
}