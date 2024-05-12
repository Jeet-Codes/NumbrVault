package com.scm.SmartContact.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControllers {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home Page Handler");

		// Sending Data view
		model.addAttribute("name","Substring Technology");
		model.addAttribute("Githubrepo","https://github.com/Jeet-Codes/NumbrVault");
		return "home";
	}
}
