package in.project.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.project.ecomm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
