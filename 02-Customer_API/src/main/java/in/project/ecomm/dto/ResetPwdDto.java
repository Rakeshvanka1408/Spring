package in.project.ecomm.dto;

import lombok.Data;

@Data
public class ResetPwdDto {

	private String name;
	private String email;
	
	private String odlPwd;
	
	private String newPwd;
	
	
	private String confirmPwd;
	

}
