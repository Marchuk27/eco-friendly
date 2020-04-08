package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;

import java.util.Optional;

public interface CompanyService {
	//Set<Company> getCompaniesByCategories(Set<Category> categories);
	Optional<Company> getCompanyById(int id);

	Iterable<Company> findAllCompaniesByName(String name);

	Iterable<Company> findAllCompaniesByCategory(Category category);
}
