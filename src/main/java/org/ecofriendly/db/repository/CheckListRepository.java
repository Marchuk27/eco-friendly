package org.ecofriendly.db.repository;

import org.ecofriendly.db.entity.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList, Long> {
    CheckList getCheckListByUserAccount_Id(Long userAccount_id);
}
