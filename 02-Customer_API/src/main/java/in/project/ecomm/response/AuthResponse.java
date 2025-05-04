package in.project.ecomm.response;

import in.project.ecomm.dto.CustomerDto;
import lombok.Data;

@Data
public class AuthResponse {
	
	private CustomerDto customer;
	
	private String token;
}
