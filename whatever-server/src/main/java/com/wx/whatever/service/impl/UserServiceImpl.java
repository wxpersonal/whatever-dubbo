package com.wx.whatever.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wx.whatever.dao.UserMapper;
import com.wx.whatever.pojo.SystemCode;
import com.wx.whatever.pojo.User;
import com.wx.whatever.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Long userId) {

		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void insertUser(User user){
		userMapper.insert(user);
	}

	@Override
	public void saveForTest() {

		User u = new User();
		u.setUserid(10001l);
		u.setUsername("weixiang");
		u.setEmail("123456789");
		userMapper.insert(u);

		throw new RuntimeException("运行时异常");
	}

	@Override
	public int insert(User obj) {
		return userMapper.insertSelective(obj);
	}

	@Override
	public User get(Integer id) {
		return userMapper.selectByPrimaryKey(id.longValue());
	}

	@Override
	public void update(User obj) {
		userMapper.updateByPrimaryKeySelective(obj);
	}

	@Override
	public void delete(String ids) {
		String[] split = StringUtils.split(ids);
		for(String id : split){
			userMapper.deleteByPrimaryKey(Long.parseLong(id));
		}
	}



	@Override
	public PageInfo<User> query(Integer pageNo, Integer pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<User> result = userMapper.list();
		PageInfo<User> pageInfo = new PageInfo<User>(result);
		return pageInfo;
	}
}
