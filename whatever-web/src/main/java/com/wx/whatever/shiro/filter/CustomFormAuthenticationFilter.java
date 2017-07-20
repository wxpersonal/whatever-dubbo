package com.wx.whatever.shiro.filter;

import com.wx.whatever.shiro.authc.CustomUsernamepasswordToken;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

    public static final String DEFAULT_LOGIN_TYPE_PARAM = "loginType";

    private String loginTypeParam = DEFAULT_LOGIN_TYPE_PARAM;


    /**
     * 重写该方法,为了将loginType参数保存到token中
     *
     * @param request  请求
     * @param response 响应
     * @return
     */
    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        String loginType = getLoginType(request);
        return createToken(username, password, request, response, loginType);
    }

    private AuthenticationToken createToken(String username, String password, ServletRequest request, ServletResponse response, String loginType) {
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);
        return createToken(username, password, rememberMe, host, loginType);
    }

    private AuthenticationToken createToken(String username, String password, boolean rememberMe, String host, String loginType) {

        return new CustomUsernamepasswordToken(username, password, rememberMe, host, loginType);
    }

    private AuthenticationToken createToken(String username, String password, String loginType) {
        return new CustomUsernamepasswordToken(username, password, loginType);
    }

    private String getLoginType(ServletRequest request) {
        return WebUtils.getCleanParam(request, "loginType");
    }

    public String getLoginTypeParam() {
        return loginTypeParam;
    }

    public void setLoginTypeParam(String loginTypeParam) {
        this.loginTypeParam = loginTypeParam;
    }
}