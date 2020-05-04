package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.UserAccount;
import org.ecofriendly.db.repository.UserAccountRepository;
import org.ecofriendly.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequestMapping("/profile")
public class ProfileController {
	private UserAccountRepository userRepository;
	private UserAccountService    userService;

	@Autowired
	private void setUserRepository(UserAccountRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Autowired
	private void setUserService(UserAccountService userService) {
		this.userService = userService;
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	/*@GetMapping("/{id}")
	public Optional<UserAccount> getUserAccount(@PathVariable Integer id) {
		return userRepository.findById(id);
	}*/

	@GetMapping("/registration")
	public String registrationPage() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registerUser(UserAccount account, Model model) {
		model.addAttribute("account", account);
		if (userService.checkFormData(account)) {
			userRepository.save(account);
			return "login";
		}
		else
			return "register-incorrect";
	}
}
