package com.wx.whatever.service;

import com.wx.whatever.pojo.Permission;
import com.wx.whatever.pojo.Role;
import com.wx.whatever.pojo.User;

import java.util.List;

public interface IUserService extends IBaseService<User> {

    List<Role> getRolesByUserId(Integer userId);

    List<Permission> getPermissionsByUserId(Integer userId);

    User getUserByEmail(String email);

    User getUserByMobile(String mobile);

}
