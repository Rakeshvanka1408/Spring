package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		int i = 10 / 0;// AE
		String msg = "Welcome to rest api";
		return msg;
	}

	@GetMapping("/greet")
	public String getGreetMsg() {

		String s = null;
		s.length();//NPE
		String msg = "Good morning";
		return msg;
	}

}
