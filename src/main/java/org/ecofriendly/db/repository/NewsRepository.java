package org.ecofriendly.db.repository;

import org.ecofriendly.db.entity.company.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}