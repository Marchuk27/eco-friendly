package org.ecofriendly.db.repository;

import org.ecofriendly.db.entity.CompanyForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFormRempository extends JpaRepository<CompanyForm, Long> {
}