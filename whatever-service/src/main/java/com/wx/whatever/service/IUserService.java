package com.wx.whatever.service;

public interface IUserService extends IBaseService<User>{

	public User getUserById(Long userId);

	public void insertUser(User user);

	public void saveForTest();
}
