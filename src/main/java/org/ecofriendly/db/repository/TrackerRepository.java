package org.ecofriendly.db.repository;

import org.ecofriendly.db.entity.Tracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackerRepository extends JpaRepository<Tracker, Long> {
    Tracker getTrackerByUserAccount_Id(Long accountId);
}
