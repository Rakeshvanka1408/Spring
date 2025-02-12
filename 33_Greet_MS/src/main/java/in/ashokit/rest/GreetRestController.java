package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.ashokit.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	@Autowired
	private WelcomeFeignClient welcomeFeign;
	
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg = "Good Morning";
		
		String welcomeMsg=welcomeFeign.invokeWelcomeMsg();
		
		return greetMsg +","+welcomeMsg;
	}
}
