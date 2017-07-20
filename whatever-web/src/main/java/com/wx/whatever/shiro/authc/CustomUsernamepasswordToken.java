package com.wx.whatever.shiro.authc;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * Created by Administrator on 2017/6/20.
 */
public class CustomUsernamepasswordToken extends UsernamePasswordToken {

    //登录类型
    private String loginType;

    public String getLoginType() {
        return this.loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public CustomUsernamepasswordToken(String username, String password, String loginType) {
        super(username, password);
        this.loginType = loginType;
    }

    public CustomUsernamepasswordToken(String username, String password, boolean rememberMe, String host, String loginType) {
        super(username, password, rememberMe, host);
        this.loginType = loginType;
    }
}
