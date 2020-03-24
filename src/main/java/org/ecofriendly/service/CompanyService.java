package org.ecofriendly.service;

import org.ecofriendly.model.Company;
import org.ecofriendly.model.company.Category;

import java.util.Optional;
import java.util.Set;

public interface CompanyService {
	//Set<Company> getCompaniesByCategories(Set<Category> categories);
	Optional<Company> getCompanyById(int id);
}
