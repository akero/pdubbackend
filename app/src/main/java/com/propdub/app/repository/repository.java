package com.propdub.app.repository;

import com.propdub.app.model.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<repository, Long> {
    // Custom methods can be added here for specific database operations
}
