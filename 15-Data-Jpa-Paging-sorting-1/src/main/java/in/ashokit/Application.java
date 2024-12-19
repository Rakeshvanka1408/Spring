package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ContactService;
import in.ashokit.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		PersonService bean = run.getBean(PersonService.class);
		//bean.personSort();
		//bean.savePersons();
		//bean.getPersonQBE("male","Chris" );
		//System.out.println("=========================================");
		//bean.getPersonsPagination();
		ContactService bean2 = run.getBean(ContactService.class);
		bean2.saveContact();
	}

}
