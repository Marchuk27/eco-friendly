package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.repository.CompanyRepository;
import org.ecofriendly.repository.company.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	private CompanyRepository  companyRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	/*@Override
	public Set<Company> getCompaniesByCategories(Set<Category> categories) {
		return companyRepository.getCompaniesByCategories(categories);
	}*/

	@Override
	public Optional<Company> getCompanyById(int id) {
		return companyRepository.findById(id);
	}

	public Iterable<Company> findAllCompaniesByName(String name) {
		return companyRepository.findAllByName(name);
	}

	@Override
	public Iterable<Company> findAllCompaniesByCategory(Category category) {
		return companyRepository.findAllByCategory(category);
	}
}
