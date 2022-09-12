package com.example.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>{

}
