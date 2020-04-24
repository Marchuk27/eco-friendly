package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompanyServiceImplementation implements CompanyService {

	private final CompanyRepository companyRepository;

	public CompanyServiceImplementation(CompanyRepository companyRepository) {
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
	public Dictionary<String, List<Company>> getCategoryCompanies(Iterable<Category> categories) {
		Dictionary<String, List<Company>> dictionary = new Hashtable<>();
		for (Category category : categories) {
			dictionary.put(category.getName(), companyRepository.findAllByCategoryIs(category));
		}
		return dictionary;
	}
}
