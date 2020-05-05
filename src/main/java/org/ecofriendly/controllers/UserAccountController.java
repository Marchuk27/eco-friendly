package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.user.Account;
import org.ecofriendly.db.entity.user.Authority;
import org.ecofriendly.db.repository.AccountRepository;
import org.ecofriendly.db.repository.AuthorityRepository;
import org.ecofriendly.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserAccountController {
	private AccountRepository   accountRepository;
	private UserAccountService  userService;
	@Autowired
	private AuthorityRepository authorityRepository;

	@Autowired
	private void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Autowired
	private void setUserService(UserAccountService userService) {
		this.userService = userService;
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/registration")
	public String registrationPage() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registerUser(Account account, Model model) {
		model.addAttribute("account", account);
		if (userService.checkFormData(account)) {
			account.setEnabled(true);
			Authority authority = new Authority();
			authority.setUsername(account);
			authority.setAuthority("ROLE_USER");
			accountRepository.save(account);
			authorityRepository.save(authority);
			return "login";
		}
		else
			return "register-incorrect";
	}
}
