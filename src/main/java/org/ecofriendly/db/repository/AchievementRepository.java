package org.ecofriendly.db.repository;

import org.ecofriendly.db.dictionaries.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
    Achievement findAchievementById(Integer id);
    boolean existsAchievementById(Integer id);
}
