package org.ecofriendly.controller;

import org.ecofriendly.model.Company;
import org.ecofriendly.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/companies")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	@RequestMapping(path = "/{name}")
	public List<Company> getCompaniesByName(@PathVariable String name){
		//TODO: Return template view(company)
		return companyService.findAllByName(name);
	}
	/*@RequestMapping(path ="/") /?id=123 */
	public Optional<Company> getCompanyById(@RequestParam int id){
		return companyService.findById(id);
	}
}
