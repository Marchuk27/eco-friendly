package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.service.interfaces.ICompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

	private final ICompanyService companyService;

	public CompanyController(ICompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping("/companies/")
	public Optional<Company> getCompanyById(@RequestParam Long id) {
		return companyService.getCompanyById(id);
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
