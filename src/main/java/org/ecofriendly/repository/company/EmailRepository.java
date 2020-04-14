package org.ecofriendly.repository.company;

import org.ecofriendly.db.handbooks.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
