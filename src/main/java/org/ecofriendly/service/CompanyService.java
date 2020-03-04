package org.ecofriendly.service;

import org.ecofriendly.model.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
	List<Company> findAllByName(String name);
	Optional<Company> findById(int id);
}
