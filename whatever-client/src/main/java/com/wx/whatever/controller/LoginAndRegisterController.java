package com.wx.whatever.controller;

import com.wx.whatever.pojo.User;
import com.wx.whatever.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("")
public class LoginAndRegisterController {
	
	@Autowired
	private IUserService IUserService;

	@RequestMapping("login")
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping("logincheck")
	@ResponseBody
	public Map<String, String> logincheck(HttpServletRequest request, HttpServletResponse response){
		
		Map<String, String> map = new HashMap<String, String>();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User u = IUserService.getUserById(1l);
		
		if(StringUtils.isBlank(username)){
			map.put("usernamemsg", "用户名不能为空！！");
		}else{
			if(username.equals(u.getUsername())){
				map.put("usernamemsg", "ok");
				map.put("passwordmsg", u.getPassword().equals(password) ? "ok" : "密码有误！！");
			}
		}
		return map;
	}
}
