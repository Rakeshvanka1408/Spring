package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/demo")
	public String getDemoMsg() {
		int i = 10 / 0;
		String msg = "This is Demo msg";
		return msg;

	}
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<String > exceptionHandler(Exception e){
		String message = e.getMessage();
		
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
