package org.ecofriendly.repository;

import org.ecofriendly.db.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
