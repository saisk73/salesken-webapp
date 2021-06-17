package com.saikiranreddy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/")
	public static String loginPage(Model model) {
	    return "index";
	}
}
