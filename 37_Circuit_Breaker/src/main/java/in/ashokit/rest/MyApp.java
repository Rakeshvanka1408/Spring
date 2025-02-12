package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class MyApp {

	@GetMapping("/data")
	@CircuitBreaker(name = "redis", fallbackMethod = "getDataFromDB")
	public String getDataFromRedis() {
		System.out.println("*****The redis method is called*****");
		int i = 10 / 0;
		return "Fetching data from redis";
	}

	public String getDataFromDB(Throwable t) {
		System.out.println("*****The Database is called");
		return "fetching data from the database";
	}
}
