package in.ashokit.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
  
}
