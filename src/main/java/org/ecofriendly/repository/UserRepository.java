package org.ecofriendly.repository;

import org.ecofriendly.db.entity.User;
import org.ecofriendly.db.handbooks.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(Set<Email> email);
}