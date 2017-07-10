package com.wx.whatever.controller;

import com.sun.javafx.collections.MappingChange;
import com.wx.whatever.pojo.Permission;
import com.wx.whatever.pojo.User;
import com.wx.whatever.pojo.UserDTO;
import com.wx.whatever.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Api(description = "permissionController")
@Controller
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private IUserService userService;


    @ApiOperation(value = "根据id获取permission")
    @ResponseBody
    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public Permission getPermissionById(@PathVariable Integer id, HttpServletRequest request) {
        return new Permission();
    }

    @ApiOperation(value = "添加user", consumes = "application/x-www-form-urlencoded")
    @RequestMapping(value = "addPermission", method = RequestMethod.POST)
    @ResponseBody
    public Integer addPermission(UserDTO u, HashMap p, @RequestParam("aaa") String aaa, HttpServletRequest request) {

        String id1 = request.getParameter("id");


        return 111;//userService.insert(u);
    }

}
