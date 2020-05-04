package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.db.repository.CompanyRepository;
import org.ecofriendly.service.interfaces.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompanyService implements ICompanyService {

	private final CompanyRepository companyRepository;

	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	@Override
	public Optional<Company> getCompanyById(Long id) {
		return companyRepository.findById(id);
	}

	@Override
	public Iterable<Company> findAllCompaniesByName(String name) {
		return companyRepository.findAllByName(name);
	}

	@Override
	public Iterable<Company> findAllCompaniesByCategories(Iterable<Category> categories) {
		return companyRepository.findAllByCategoryIn(categories);
	}

	@Override
	public Dictionary<String, Iterable<Company>> getCategoryCompanies(Iterable<Category> categories) {
		Dictionary<String, Iterable<Company>> dictionary = new Hashtable<>();
		for (Category category : categories) {
			dictionary.put(category.getName(), companyRepository.findAllByCategoryIs(category));
		}
		return dictionary;
	}
}
