package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

	private final CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping("/companies/")
	public Optional<Company> getCompanyById(@RequestParam Long id) {
		return companyService.getCompanyById(id);
	}

	@PostMapping("/companies")
	public String sendCompanyRequest() {
		return null;
	}

	@GetMapping("/companies")
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}

	@GetMapping("/companies/{name}")
	public Iterable<Company> findAllCompaniesByName(@PathVariable String name) {
		return companyService.findAllCompaniesByName(name);
	}
}
