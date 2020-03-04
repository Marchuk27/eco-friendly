package org.ecofriendly.service;

import org.ecofriendly.model.Company;
import org.ecofriendly.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	private CompanyRepository repository;
	@Override
	public List<Company> findAllByName(String entity) {
		//TODO: Checks
		return repository.findAllByName(entity);
	}
}
