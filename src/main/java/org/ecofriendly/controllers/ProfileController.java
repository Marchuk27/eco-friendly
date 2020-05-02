package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.UserAccount;
import org.ecofriendly.db.repository.UserAccountRepository;
import org.ecofriendly.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	private UserAccountRepository userRepository;
	private UserAccountService userService;

	@Autowired
	private void setUserRepository(UserAccountRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Autowired
	private void setUserService(UserAccountService userService) {
		this.userService = userService;
	}

	@GetMapping()
	public String profile() {
		return "profile";
	}

	@GetMapping("/registration")
	public String registrationPage() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registerUser(UserAccount account, Model model) {
		model.addAttribute("account", account);
		if (userService.checkFormData(account)) {
			userRepository.save(account);
			return "profile";
		}
		else
			return "register-incorrect";
	}
}
