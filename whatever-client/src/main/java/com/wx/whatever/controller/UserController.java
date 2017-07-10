package com.wx.whatever.controller;

import com.wx.whatever.pojo.User;
import com.wx.whatever.pojo.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.wx.whatever.service.IUserService;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Api(description = "user相关操作")
//@Controller
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;


    @ApiOperation(value = "根据id获取user")
    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Integer id, HttpServletRequest request) {
        return userService.getById(id);
    }

    @ApiOperation(value = "添加user")
    @RequestMapping(value = "addUser", method = RequestMethod.POST, consumes = "application/json")
    public Integer addUser(@RequestBody User u) {

        System.out.printf(u.getEmail());

        return 111;//userService.insert(u);
    }

}
