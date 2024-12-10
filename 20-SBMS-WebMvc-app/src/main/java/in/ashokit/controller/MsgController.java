package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
		
	@GetMapping("/Welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","welcome to ashokit");
		mv.setViewName("index");
		return mv;
	}
}
