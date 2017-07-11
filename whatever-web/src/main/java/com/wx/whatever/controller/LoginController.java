package com.wx.whatever.controller;

import com.wx.whatever.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/23.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private IUserService userService;
}
