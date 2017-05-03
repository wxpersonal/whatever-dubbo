package com.wx.whatever.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: Wells.Wei
 * @Date: 2017/4/25
 * @Description:
 */
public interface IBaseService<T> {

    int insert(T obj);

    T get(Integer id);

    void update(T obj);

    void delete(String ids);

    PageInfo<T> query(Integer pageNo, Integer pageSize);
}
