package com.wx.whatever.controller;

import com.wx.whatever.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/23.
 */
@Api(description = "登录控制器")
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private IUserService userService;
}
