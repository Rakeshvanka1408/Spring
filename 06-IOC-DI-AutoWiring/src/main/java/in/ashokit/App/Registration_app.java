package in.ashokit.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class Registration_app {

	public static void main(String [] args) {
		
	
	ApplicationContext  ctxt = new ClassPathXmlApplicationContext("Bean.xml");
			UserService bean = ctxt.getBean(UserService.class);
			bean.userRegistration();
				
	}
}
