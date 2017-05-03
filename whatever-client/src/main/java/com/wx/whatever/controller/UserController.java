package com.wx.whatever.controller;

import com.wx.whatever.pojo.User;
import com.wx.whatever.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private IUserService IUserService;
	
	@RequestMapping("getUser")
	public ModelAndView getUserById(){
		
		ModelAndView mav = new ModelAndView("getUser");
		User u = IUserService.getUserById(10000l);
		mav.addObject("user", u);
		return mav;
	}

	@RequestMapping("addUser")
	@ResponseBody
	public void addUser(){

		User u = IUserService.getUserById(10000l);
		u.setUserid(10001l);
		u.setUsername("weixiang");
		u.setEmail("123456789");
		IUserService.insertUser(u);
	}

	@RequestMapping("testTrans")
	@ResponseBody
	public void testTrans(){
		IUserService.saveForTest();
	}
}
