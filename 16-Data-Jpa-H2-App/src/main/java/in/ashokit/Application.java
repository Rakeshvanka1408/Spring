package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.H2Service;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(Application.class, args);
		H2Service bean = ctxt.getBean(H2Service.class);
		bean.saveTest();
	}

}