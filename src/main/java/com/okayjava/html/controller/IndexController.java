package com.okayjava.html.controller;

import com.okayjava.html.model.userLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.okayjava.html.model.User;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "login";
	}
	@GetMapping("/register")
	public String register(){
		return "register";
	}

	@PostMapping("/login")
	public String userlogin(@ModelAttribute userLogin user, Model model, RedirectAttributes redirAttrs){
		return "redirect:https://k-ramp-movies.onrender.com/";
	}
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		// validate 
		System.out.println(user.getName());
		System.out.println(user.getDob());
		System.out.println(user.getEmail());
		model.addAttribute("name", user.getName());
		return "welcome";
	}


}
