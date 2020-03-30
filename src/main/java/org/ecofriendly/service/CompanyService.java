package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;

import java.util.Optional;

public interface CompanyService {
	//Set<Company> getCompaniesByCategories(Set<Category> categories);
	Optional<Company> getCompanyById(int id);
}
