package com.lbj.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lbj.model.User;
import com.lbj.service.UserService;




public class HibernateTest {

	static String configLocations="applicationContext.xml";
	static ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocations); 

	public static void main(String[] args) {
		
		UserService userService = (UserService) ctx.getBean("userService");   

		User user=new User();
		user.setPassword("liubaojun");
		user.setPhone("13621677347");
		user.setEmail("815145525@qq.com");
		user.setUsername("lbj");
		user.setCreated(new Date());
		user.setUpdated(new Date());
		Long j=userService.saveUser(user);
		
		System.out.println("执行结果："+j);
	}

}
