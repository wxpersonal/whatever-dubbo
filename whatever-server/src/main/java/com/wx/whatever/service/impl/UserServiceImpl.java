package com.wx.whatever.service.impl;

import com.wx.whatever.base.BaseServiceImpl;
import com.wx.whatever.dao.PermissionMapper;
import com.wx.whatever.dao.RoleMapper;
import com.wx.whatever.dao.UserMapper;
import com.wx.whatever.pojo.Permission;
import com.wx.whatever.pojo.Role;
import com.wx.whatever.pojo.User;
import com.wx.whatever.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private PermissionMapper permissionMapper;

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Role> getRolesByUserId(Integer userId) {
        return roleMapper.getRolesByUserId(userId);
    }

    @Override
    public List<Permission> getPermissionsByUserId(Integer userId) {

        List<Permission> permissionList = new ArrayList<Permission>();
        List<Role> roleList = getRolesByUserId(userId);
        for(Role role : roleList){
            List<Permission> permissions = permissionMapper.getPermissionsByRoleId(role.getId());
            permissionList.addAll(permissions);
        }
        return permissionList;
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    @Override
    public User getUserByMobile(String mobile) {
        return userMapper.getUserByMobile(mobile);
    }
}
