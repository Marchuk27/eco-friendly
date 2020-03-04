package org.ecofriendly.service;

import org.ecofriendly.model.Company;
import org.ecofriendly.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	private CompanyRepository repository;
	@Override
	public Company findByName(String entity) {
		//TODO: Checks
		return repository.findByName(entity);
	}
}
