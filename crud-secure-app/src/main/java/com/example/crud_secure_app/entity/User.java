package com.example.crud_secure_app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Full name is required")
    private String fullName;

    @NotEmpty(message = "Username is required")
    @Size(min = 4, message = "Username should be at least 4 characters")
    @Column(unique = true)  // Ensure uniqueness in the database
    private String username;

    @NotEmpty(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    @Column(unique = true)  // Ensure uniqueness in the database
    private String email;

    @NotEmpty(message = "Password is required")
    private String password;
}