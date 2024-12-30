package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/msg")
public class MsgController {

	@GetMapping("/Welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "welcome to ashokit");
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msgT = "Hello, good morning!";
		model.addAttribute("msg", msgT);
		return "index";
	}
}
