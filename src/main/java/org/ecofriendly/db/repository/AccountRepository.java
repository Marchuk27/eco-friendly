package org.ecofriendly.db.repository;

import org.ecofriendly.db.entity.user.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	Account findAccountByEmail(String email);
}