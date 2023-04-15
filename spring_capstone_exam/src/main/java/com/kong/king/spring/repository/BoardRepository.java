package com.kong.king.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kong.king.spring.entity.Board;

public interface BoardRepository extends JpaRepository<Board, String> {

}
