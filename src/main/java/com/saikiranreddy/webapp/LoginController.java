package com.saikiranreddy.webapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saikiranreddy.webapp.model.User;
import com.saikiranreddy.webapp.repository.UserRepository;

@Controller
@Service
public class LoginController {

	@Autowired
	UserRepository userRepository;

	@GetMapping(value = "/")
	public String login(Model model) {
	    return "index";
	}
	
	@PostMapping(value = "/")
	public String loginPost(Model model) {

		return "redirect:/";
	}

	@GetMapping(value = "/login")
	public String loginRedirect(Model model) {
	    return "redirect:/";
	}


	@GetMapping(value = "/register")
	public String registerPage(Model model) {
	    return "register";
	}

	@PostMapping(value = "/register")
	public String registerPost(@ModelAttribute User user) {
		userRepository.save(user);
	    return "redirect:/";
	}
}
