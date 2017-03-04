package com.lbj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lbj.model.User;
import com.lbj.service.UserService;




public class MybatisTest {

	static String configLocations="applicationContext.xml";
	static ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocations); 

	public static void main(String[] args) {
		
		UserService userService = (UserService) ctx.getBean("userService");   

		User user=userService.selectUser(14l);
		
		if(user==null){
			System.out.println("用户不存在。。");
		}else{
			System.out.println(user.getUsername());
		}
		
	}

}
