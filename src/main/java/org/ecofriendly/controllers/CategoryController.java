package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Dictionary;
import java.util.List;

@RestController
public class CategoryController {
	private final CompanyService companyService;

	public CategoryController(CompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping("/category/")
	public Dictionary<String, List<Company>> getCategoryCompaniesDictionary(@RequestParam List<Category> category) {
		return companyService.getCategoryCompanies(category);
	}
}
