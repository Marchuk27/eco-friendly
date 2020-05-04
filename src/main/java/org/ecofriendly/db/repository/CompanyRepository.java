package org.ecofriendly.db.repository;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findAll();

    Iterable<Company> findAllByName(String name);

    Iterable<Company> findAllByCategoryIn(Iterable<Category> category);

    Iterable<Company> findAllByCategoryIs(Category category);
}
