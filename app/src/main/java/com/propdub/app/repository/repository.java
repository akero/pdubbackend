package com.propdub.app.repository;
import com.propdub.app.model.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<model, Long> {
}