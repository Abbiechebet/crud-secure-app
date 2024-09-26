package com.example.crud_secure_app.repository;

import com.example.crud_secure_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Check if a user exists by email
    boolean existsByEmail(String email);

    // Check if a user exists by username
    boolean existsByUsername(String username);

    // Add this method to find a user by their username
    Optional<User> findByUsername(String username);  // Return Optional to handle absence
}
