package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.UserServiceImpl;

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

	public String formSubmit(User user, Model model) {
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
	public String editUser(@PathVariable("uid")Integer uid,Model model) {
		User editUser = userServiceImpl.editUser(uid);
		if(editUser !=null) {
			model.addAttribute("rmsg", editUser);
			return "index";
		}
		else {
			model.addAttribute("pmsg",editUser);
			return "users";
		}
	}
	@GetMapping("/delete/{uid}")
	public String deleteUsers(@PathVariable("uid") Integer uid,Model model) {
		boolean deleteUser = userServiceImpl.deleteUser(uid);
		if(deleteUser) {
			model.addAttribute("omsg","The record deleted sucessfully");
		}
		else {
			model.addAttribute("fmsg","The record is not deleted");
		}
		
		return "redirect:/users";
	}
}
