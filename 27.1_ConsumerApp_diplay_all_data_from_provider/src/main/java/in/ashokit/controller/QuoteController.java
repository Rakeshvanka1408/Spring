package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.entity.QuoteEntity;
import in.ashokit.service.QuoteService;

@Controller

public class QuoteController {

	
	@Autowired
	 private QuoteService quoteService;
	
}