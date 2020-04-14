package org.ecofriendly.repository;

import org.ecofriendly.db.entity.Company;
import org.ecofriendly.db.entity.company.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Iterable<Company> findAllByName(String name);

    Iterable<Company> findAllByCategoriesIn(Iterable<Category> category);
}
