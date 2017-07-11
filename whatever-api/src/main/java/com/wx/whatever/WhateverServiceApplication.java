package com.wx.whatever;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class WhateverServiceApplication {

	private static Logger _log = LoggerFactory.getLogger(WhateverServiceApplication.class);

	public static void main(String[] args) {
		_log.info(">>>>> whatever-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
		_log.info(">>>>> whatever-service 启动完成 <<<<<");
	}

}
