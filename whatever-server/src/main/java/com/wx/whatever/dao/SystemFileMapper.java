package com.wx.whatever.dao;

import com.wx.whatever.pojo.SystemFile;

public interface SystemFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemFile record);

    int insertSelective(SystemFile record);

    SystemFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemFile record);

    int updateByPrimaryKey(SystemFile record);
}