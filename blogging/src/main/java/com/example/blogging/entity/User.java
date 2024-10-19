package com.example.blogging.entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,name = "user_name")
    private String name;
    private String about;
    private String email;
    private String password;

    // Getters and Setters

}