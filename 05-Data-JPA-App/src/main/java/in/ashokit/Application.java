package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run 
				= SpringApplication.run(Application.class, args);
		EmployeeRepo emprepo = run.getBean(EmployeeRepo.class);
		
			System.out.println("Impl emp"+emprepo.getClass().getName());
			
			Employee e = new Employee();
			 e.setEmpId(102);
			 e.setEmpName("Brad pitt");
			 e.setEmpSalary(25000.2);
			 emprepo.save(e);

				Employee e1= new Employee();
				 e1.setEmpId(100);
				 e1.setEmpName("Chris Evans");
				 e1.setEmpSalary(25000.2);
				 
			
	}

}
