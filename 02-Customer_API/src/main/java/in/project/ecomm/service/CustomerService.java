package in.project.ecomm.service;

import in.project.ecomm.dto.CustomerDto;
import in.project.ecomm.dto.ResetPwdDto;
import in.project.ecomm.response.AuthResponse;

public interface CustomerService {

	
	
	public Boolean isEmailUnique(String email);
	
	public Boolean register(CustomerDto customerDto);
	
	public CustomerDto getCustomerByEmail(String email);

	
	public Boolean resetPwd(ResetPwdDto resetPwdDto);
	
	public AuthResponse login (CustomerDto customerDto);
	
	
	
}
