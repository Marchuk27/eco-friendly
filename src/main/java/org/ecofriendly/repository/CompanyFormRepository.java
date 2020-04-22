package org.ecofriendly.repository;

import org.ecofriendly.db.entity.CompanyForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyFormRepository extends JpaRepository<CompanyForm, Long> {
}
