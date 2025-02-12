package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.userService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt
				= SpringApplication.run(Application.class, args);
		userService bean = ctxt.getBean(userService.class);
		// bean.saveUser();
		bean.findAllUser();
		//bean.deleteById();
		//bean.deleteAll();
		 //bean.findByCountry("UK");
		//bean.findByCountryAndId("Canada", 104);
		//bean.getCount();
		//bean.getAllUsersHql();
		//System.out.println("=======================");
	//	bean.getAllUsersSql();
		//bean.updateUserHql();
		//bean.updateUseSql();
		//bean.deleteUserHql();
		//bean.deleteUserSql();
	}

}
