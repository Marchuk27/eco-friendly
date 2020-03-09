package org.ecofriendly.service;

import org.ecofriendly.model.Company;
import org.ecofriendly.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImplementation implements CompanyService {

	@Autowired
	private CompanyRepository repository;
	@Override
	public List<Company> findAllByName(String entity) {
		//TODO: Checks
		return repository.findAllByName(entity);
	}

	@Override
	public Optional<Company> findById(int id) {
		return repository.findById(id);
	}
}
