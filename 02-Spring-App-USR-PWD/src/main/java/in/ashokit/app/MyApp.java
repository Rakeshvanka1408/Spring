package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = 
				new ClassPathXmlApplicationContext("Beans.xml");
		UserService bean = ctxt.getBean(UserService.class);
		bean.saveUser("rakesh", "rakeshvanka-14", 9704540963l);
		

		
	
	}

}