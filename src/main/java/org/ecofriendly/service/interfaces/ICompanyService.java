package org.ecofriendly.service.interfaces;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;

import java.util.Dictionary;
import java.util.List;
import java.util.Optional;

public interface ICompanyService {

	List<Company> getAllCompanies();

	Optional<Company> getCompanyById(Long id);

	Iterable<Company> findAllCompaniesByName(String name);

	Iterable<Company> findAllCompaniesByCategories(Iterable<Category> categories);

	Dictionary<String, List<Company>> getCategoryCompanies(Iterable<Category> categories);
}