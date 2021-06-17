package com.saikiranreddy.webapp.controllers;

import com.saikiranreddy.webapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @Autowired
	UserRepository userRepository;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "admin/dashboard";
    }
}
