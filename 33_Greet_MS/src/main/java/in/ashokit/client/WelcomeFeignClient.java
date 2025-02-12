package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("32-MS-Welcome-t0-MS")
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();
	
}
