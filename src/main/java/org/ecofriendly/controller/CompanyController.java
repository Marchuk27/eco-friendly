package org.ecofriendly.controller;

import org.ecofriendly.model.Company;
import org.ecofriendly.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
