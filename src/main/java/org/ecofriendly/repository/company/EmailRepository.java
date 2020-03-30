package org.ecofriendly.repository.company;

import org.ecofriendly.db.model.company.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, Integer> {
}
