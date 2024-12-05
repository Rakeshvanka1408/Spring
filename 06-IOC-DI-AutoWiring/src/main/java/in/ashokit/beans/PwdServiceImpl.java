package in.ashokit.beans;

public class PwdServiceImpl implements IPwdService  {
	
	public String generatePwd() {
		System.out.println("Password generated");
		return "abce@123";
	}
	
}
