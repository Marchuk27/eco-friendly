package org.ecofriendly.repository;

import org.ecofriendly.db.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
	UserAccount findByEmail(String email);

	UserAccount findUserAccountByEmail(String email);
}