package org.ecofriendly.repository;

import org.ecofriendly.db.entity.User;
import org.ecofriendly.db.handbooks.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(Email email);
}