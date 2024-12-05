package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Motor;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Bean.xml");
		// below code is for beans life cycle
//	Motor m=	ctxt.getBean(Motor.class);
//	m.doWork();
//	ConfigurableApplicationContext cactxt = (ConfigurableApplicationContext) ctxt;
//	cactxt.close();
	}
}

