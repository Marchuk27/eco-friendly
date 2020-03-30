package org.ecofriendly.repository.company;

import org.ecofriendly.db.model.company.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
