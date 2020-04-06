package org.ecofriendly.repository;

import org.ecofriendly.db.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Iterable<Company> findAllByName(String name);
}
