package in.ashokit.beans;

public class UserService {
	private IPwdService pwdService;
	private IUserDao userDao;
	private IEmailService emailService;

	public UserService() {
		System.out.println("The : 0-Param Constructor");
	}

	public void setUserService(IPwdService pwdService, IUserDao userDao, IEmailService emailService) {
		System.out.println("Setter method");
		this.pwdService = pwdService;
		this.emailService = emailService;
		this.userDao = userDao;
		
	}
		public UserService(IPwdService pwdService, IUserDao userDao, IEmailService emailService) {
			System.out.println("The Param-constructor");
			this.pwdService = pwdService;
			this.emailService = emailService;
			this.userDao = userDao;
			
		}
		public  void userRegistration() {
			pwdService.generatePwd();
			emailService.sendEmail();
			userDao.saveUser();
			System.out.println("User sucessfully registered");
			
			
		}

}
