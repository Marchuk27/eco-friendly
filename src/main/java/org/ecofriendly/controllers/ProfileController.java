package org.ecofriendly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	@RequestMapping()
	public String profile() {
		return "profile";
	}

	@RequestMapping(path = "/registration")
	public String registrationPage() {
		return "registration";
	}

	@RequestMapping(method = RequestMethod.POST, path = "/registration")
	public String register() {
		return null; //redirect
	}
}
