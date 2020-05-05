package org.ecofriendly.controllers.api;

import org.ecofriendly.db.entity.user.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class Profile {
	@GetMapping("/{id}")
	public Optional<Account> getUserAccount(@PathVariable Integer id) {
		return null/*userService.findById(id)*/;
	}
}
