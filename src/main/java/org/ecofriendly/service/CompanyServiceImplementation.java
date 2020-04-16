package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.ecofriendly.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

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
		return companyRepository.findAllByCategoriesIn(categories);
	}

}
