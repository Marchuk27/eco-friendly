package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CompanyServiceImplementation implements CompanyService{

	@Autowired
	private CompanyRepository companyRepository;
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
}
