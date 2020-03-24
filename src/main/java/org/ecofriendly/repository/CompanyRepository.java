package org.ecofriendly.repository;

import org.ecofriendly.model.Company;
import org.ecofriendly.model.company.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
