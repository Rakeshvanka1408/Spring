package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.User;
import in.ashokit.service.UserServiceImpl;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	public UserServiceImpl userServiceImpl;

	@GetMapping("/")
	public String loadForm(Model model) {
		User uobj = new User();
		model.addAttribute("user", uobj);
		return "index";
	}
	
	@PostMapping("/save")

	public String formSubmit(@Valid User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "index";
		}
		boolean saveUser = userServiceImpl.saveUser(user);
		if (saveUser) {
			model.addAttribute("smsg", "user saved");
		} else {
			model.addAttribute("emsg", "user not saved");
		}
		return "index";
	}

	@GetMapping("/users")

	public String getUser(Model model) {
		List<User> allUser = userServiceImpl.getAllUser();
		model.addAttribute("users", allUser);
		return "users";
	}

	@GetMapping("/edit/{uid}")
	public String editUser(@PathVariable("uid") Integer uid, Model model) {
		User editUser = userServiceImpl.editUser(uid);
		
		model.addAttribute(editUser);
		return "index";
	}

	@GetMapping("/delete-user")
	public String deleteUsers(@RequestParam("uid") Integer uid, Model model) {
		boolean deleteUser = userServiceImpl.deleteUser(uid);
		if (deleteUser) {
			model.addAttribute("omsg", "The record deleted sucessfully");
			List<User> allUser = userServiceImpl.getAllUser();
			model.addAttribute("users", allUser);
		} else {
			model.addAttribute("fmsg", "The record is not deleted");
		}

		return "redirect:/users";
	}
}
