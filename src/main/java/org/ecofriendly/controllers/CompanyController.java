package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	private final CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping(path = "/")
	public Optional<Company> getCompanyById(@RequestParam Long id) {
		return companyService.getCompanyById(id);
	}

	@GetMapping("/all")
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}

	@GetMapping("/{name}")
	public Iterable<Company> findAllCompaniesByName(@PathVariable String name) {
		return companyService.findAllCompaniesByName(name);
	}


}
