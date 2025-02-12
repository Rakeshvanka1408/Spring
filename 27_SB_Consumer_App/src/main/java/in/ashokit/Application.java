package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		getWelcomeMsg();
		getRandomQuote();
	}
		public static void getWelcomeMsg() {
		
		String apiURL ="https://api.restful-api.dev/objects/";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> forEntity = rt.getForEntity(apiURL,String.class);
		
		System.out.println(forEntity.getBody());
		System.out.println(forEntity.getStatusCode().value());
		
	}
	 public static void getRandomQuote() {
		 String apiURL = "https://dummyjson.com/quotes/random";
		 RestTemplate rt = new RestTemplate();
			
			ResponseEntity<String> forEntity = rt.getForEntity(apiURL,String.class);
			
			System.out.println(forEntity.getBody());
			System.out.println(forEntity.getStatusCode().value());
			
		 
	 }

}
