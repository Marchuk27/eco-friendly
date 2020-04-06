package org.ecofriendly.controllers;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class CompanyController {
	@Autowired
	CompanyService companyService;

	@RequestMapping(path = "/")
	public Optional<Company> getCompanyById(@RequestParam int id){
		return companyService.getCompanyById(id);
	}
	@RequestMapping("/{name}")
	public Iterable<Company> findAllCompaniesByName(@PathVariable String name){
		return companyService.findAllCompaniesByName(name);
	}
}
