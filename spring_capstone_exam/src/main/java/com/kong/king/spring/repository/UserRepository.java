package com.kong.king.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kong.king.spring.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}