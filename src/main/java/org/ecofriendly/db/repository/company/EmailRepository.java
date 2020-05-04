package org.ecofriendly.db.repository.company;

import org.ecofriendly.db.dictionaries.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
