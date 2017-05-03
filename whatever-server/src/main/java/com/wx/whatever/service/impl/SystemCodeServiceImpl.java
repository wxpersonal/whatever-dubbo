package com.wx.whatever.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wx.whatever.dao.SystemCodeMapper;
import com.wx.whatever.pojo.SystemCode;
import com.wx.whatever.service.ISystemCodeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wxper on 2017/4/25.
 */
@Service
public class SystemCodeServiceImpl implements ISystemCodeService{

    @Resource
    private SystemCodeMapper systemCodeMapper;

    @Override
    public int insert(SystemCode obj) {
        return systemCodeMapper.insertSelective(obj);
    }

    @Override
    public SystemCode get(Integer id) {
        return systemCodeMapper.selectByPrimaryKey(id + "");
    }

    @Override
    public void update(SystemCode obj) {
        systemCodeMapper.updateByPrimaryKeySelective(obj);
    }

    @Override
    public void delete(String ids) {
        String[] split = StringUtils.split(ids);
        for(String id : split){
            systemCodeMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageInfo<SystemCode> query(Integer pageNo, Integer pageSize) {

        PageHelper.startPage(pageNo, pageSize);
        List<SystemCode> result = systemCodeMapper.list();
        PageInfo<SystemCode> pageInfo = new PageInfo<SystemCode>(result);
        return pageInfo;
    }
}
