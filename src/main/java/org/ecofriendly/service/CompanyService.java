package org.ecofriendly.service;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;

import java.util.Optional;

public interface CompanyService {

	Optional<Company> getCompanyById(Long id);

	Iterable<Company> findAllCompaniesByName(String name);

	Iterable<Company> findAllCompaniesByCategories(Iterable<Category> categories);
}
