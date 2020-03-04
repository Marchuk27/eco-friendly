package org.ecofriendly.service;

import org.ecofriendly.model.Company;

import java.util.List;

public interface CompanyService {
	List<Company> findAllByName(String name);
}
