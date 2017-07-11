package com.wx.whatever.util;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 根据属性名获取属性文件中的属性值
 * @createdate 2016年5月30日 上午10:22:20
 */
public class PropertyUtil extends PropertyPlaceholderConfigurer {
	private static Map<String, Object> ctxPropertiesMap;

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {

		super.processProperties(beanFactory, props);
		// load properties to ctxPropertiesMap
		ctxPropertiesMap = new HashMap<String, Object>();
		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			String value = props.getProperty(keyStr);
			ctxPropertiesMap.put(keyStr, value);
		}
	}

	// static method for accessing context properties
	public static Object getContextProperty(String name) {
		String env = (String)ctxPropertiesMap.get("env");
		Object value = ctxPropertiesMap.get(env+"." + name);
		if(value != null){
			return value;
		}else{
			return ctxPropertiesMap.get(name);
		}
	}
}
