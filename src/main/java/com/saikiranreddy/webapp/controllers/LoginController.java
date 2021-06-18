package com.saikiranreddy.webapp.controllers;


import javax.servlet.http.HttpServletRequest;

import com.saikiranreddy.webapp.model.User;
import com.saikiranreddy.webapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String loginPost(HttpServletRequest request, Model model, RedirectAttributes attrs) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User userData = userRepository.findOneByEmail(email);
		if(userData == null) {
			attrs.addFlashAttribute("status", 0);
			return "redirect:/";
		}
		String userPassword = userData.getPassword();
		if(userPassword.equals(password)){
			return "redirect:/dashboard";
		} else {
			attrs.addFlashAttribute("status", 1);
			return "redirect:/";
		}
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
