package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.DieselEngine;


public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Bean.xml");
		
				DieselEngine bean = ctxt.getBean(DieselEngine.class);
				bean.diesel();
				
		}
	
}