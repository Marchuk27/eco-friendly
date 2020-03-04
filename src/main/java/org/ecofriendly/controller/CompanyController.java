package org.ecofriendly.controller;

import org.ecofriendly.model.Company;
import org.ecofriendly.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/companies")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	@RequestMapping(path = "/{name}")
	public Company getCompanyByName(@PathVariable String name){
		//TODO: Return template view(company)
		return companyService.findByName(name);
	}
}
