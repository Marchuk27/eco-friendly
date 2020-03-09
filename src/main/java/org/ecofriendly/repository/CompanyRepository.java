package org.ecofriendly.repository;

import org.ecofriendly.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
	List<Company> findAllByName(String entity);
}
