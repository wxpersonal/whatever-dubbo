package com.wx.whatever.controller;

import com.wx.whatever.service.IUserService;
import com.wx.whatever.shiro.authc.CustomUsernamepasswordToken;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/6/23.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private IUserService userService;


    @RequestMapping(value = "/toLogin")
    public ModelAndView toLogin() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password,
                        @RequestParam("loginType") String loginType) {

        if(StringUtils.isBlank(username)) {
            throw new RuntimeException("username cannot be empty！！");
        }
        if(StringUtils.isBlank(password)) {
            throw new RuntimeException("password cannot be empty！！");
        }

        Subject subject = SecurityUtils.getSubject();
        CustomUsernamepasswordToken token = new CustomUsernamepasswordToken(username, password, loginType);
        subject.login(token);
        return new ModelAndView("homePage");
    }

}
