package com.wx.whatever.dao;

import com.wx.whatever.pojo.SysFile;

public interface SysFileMapper {
    int deleteByPrimaryKey(Long fileid);

    int insert(SysFile record);

    int insertSelective(SysFile record);

    SysFile selectByPrimaryKey(Long fileid);

    int updateByPrimaryKeySelective(SysFile record);

    int updateByPrimaryKey(SysFile record);
}