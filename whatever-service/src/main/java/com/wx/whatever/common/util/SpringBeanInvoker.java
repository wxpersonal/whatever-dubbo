package com.wx.whatever.common.util;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * spring配置辅助类，可以在代码中直接获取spring中配置的bean
 * @Description
 * @Company 江苏欣网科技股份有限公司
 * @author cww
 * @createdate 2016年5月30日 上午10:17:46
 */
public class SpringBeanInvoker implements ApplicationContextAware {

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * 
	 * @param applicationContext
	 * @throws BeansException
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringBeanInvoker.applicationContext = applicationContext;
	}

	/**
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 获取对象
	 * 
	 * @param name
	 * @return Object 一个以所给名字注册的bean的实例
	 * @throws BeansException
	 */
	public static Object getBean(String name) throws BeansException {
		return applicationContext.getBean(name);
	}

	/**
	 * 获取类型为requiredType的对象
	 * 如果bean不能被类型转换，相应的异常将会被抛出（BeanNotOfRequiredTypeException）
	 * 
	 * @param name
	 *            bean注册名
	 * @param requiredType
	 *            返回对象类型
	 * @return Object 返回requiredType类型对象
	 * @throws BeansException
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object getBeanByClass(String name, Class requiredType) throws BeansException {
		return applicationContext.getBean(name, requiredType);
	}

	/**
	 * 如果BeanFactory包含一个与所给名称匹配的bean定义，则返回true
	 * 
	 * @param name
	 * @return boolean
	 */
	public static boolean containsBean(String name) {
		return applicationContext.containsBean(name);
	}

	/**
	 * 判断以给定名字注册的bean定义是一个singleton还是一个prototype。
	 * 如果与给定名字相应的bean定义没有被找到，将会抛出一个异常（NoSuchBeanDefinitionException）
	 * 
	 * @param name
	 * @return boolean
	 * @throws NoSuchBeanDefinitionException
	 */
	public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		return applicationContext.isSingleton(name);
	}

	/**
	 * @param name
	 * @return Class 注册对象的类型
	 * @throws NoSuchBeanDefinitionException
	 */
	@SuppressWarnings("rawtypes")
	public static Class getType(String name) throws NoSuchBeanDefinitionException {
		return applicationContext.getType(name);
	}

	/**
	 * 如果给定的bean名字在bean定义中有别名，则返回这些别名
	 * 
	 * @param name
	 * @return
	 * @throws NoSuchBeanDefinitionException
	 */
	public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
		return applicationContext.getAliases(name);
	}
	
	
	/**
	 * 清除applicationContext静态变量.
	 */
	public static void cleanApplicationContext()
	{
		applicationContext = null;
	}

	private static void checkApplicationContext()
	{
		if (applicationContext == null)
		{
			throw new IllegalStateException("applicationContext未注入,请在applicationContext.xml中定义SpringContextHolder");
		}
	}
	
	/**
	 * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz)
	{
		checkApplicationContext();
		return (T) applicationContext.getBeansOfType(clazz);
	}
	
	public static <T> T getBean(String name,Class<T> requiredType)
	{
		checkApplicationContext();
		return  applicationContext.getBean(name, requiredType);
	}
}
