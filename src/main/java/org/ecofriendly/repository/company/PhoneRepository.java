package org.ecofriendly.repository.company;

import org.ecofriendly.db.model.company.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {
}
