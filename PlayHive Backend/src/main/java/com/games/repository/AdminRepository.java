package com.games.repository;

import com.games.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    
    // Find admin by email and password
    Optional<Admin> findByEmailAndPassword(String email, String password);
    
    // Find admin by email
    Optional<Admin> findByEmail(String email);
}