package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctxt = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		Car car = ctxt.getBean(Car.class);
		
		car.drive();
	}

}