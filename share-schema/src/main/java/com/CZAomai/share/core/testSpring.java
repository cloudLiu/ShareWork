package com.CZAomai.share.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.CZAomai.share.core.entity.Boss;
import com.CZAomai.share.core.entity.Car;
import com.CZAomai.share.core.repository.repositoryImpl.HNormalUserDaoImpl;
import com.CZAomai.share.core.service.NormalUserService;

public class testSpring {
	
	public static void main(String[] args)
	{
//		AutowiredAnnotationBeanPostProcessor 
//		@Qualifier("office") 中的 office 是 Bean 的名称，所以 @Autowired 和@Qualifier 结合使用时，自动注入的策略就从 byType 转变成 byName 了。@Autowired 可以对成员变量、方法以及构造函数进行注释，而@Qualifier 的标注对象是成员变量、方法入参、构造函数入参。正是由于注释对象的不同，所以 Spring 不将 @Autowired 和@Qualifier 统一成一个注释类。下面是对成员变量和构造函数入参进行注释的代码：
//		对成员变量进行注释：
		String[] locations = {"applicationContext-hibernate.xml"};
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext  tx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(tx.containsBean("car"));
		Boss boss = (Boss)tx.getBean("boss");
		System.out.println(boss.getCar().getName());
		Car ca = (Car)tx.getBean("car");
		System.out.println(ca.getName());
		
		
		HNormalUserDaoImpl im = tx.getBean(HNormalUserDaoImpl.class);
		System.out.println(im);
		
//		NormalUserService service = tx.getBean(NormalUserService.class);
		tx.close();
	}

}
