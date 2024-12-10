package in.ashokit.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Logging_msg {

public void saveUser() {
	log.info("the method started");
	log.info("this method ended");
	
}
}
