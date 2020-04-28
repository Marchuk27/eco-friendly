package org.ecofriendly.controllers;

import lombok.extern.slf4j.Slf4j;
import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.service.interfaces.ICompanyService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Dictionary;
import java.util.List;
import java.util.Objects;

@RestController
@Slf4j
public class CategoryController {
	private final ICompanyService companyService;

	public CategoryController(ICompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping("/category/")
	public Dictionary<String, List<Company>> getCategoryCompaniesDictionary(@RequestParam List<Category> category) {
		Dictionary<String, List<Company>> companyDictionary =  companyService.getCategoryCompanies(category);
		if (Objects.isNull(companyDictionary) || ObjectUtils.isEmpty(companyDictionary)) {
			log.error("В БД отсутствуют компании");
		}
		return companyService.getCategoryCompanies(category);
	}
}
