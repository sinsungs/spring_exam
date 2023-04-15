//package com.kong.king.spring.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//
//import com.kong.king.spring.entity.Posts;
//
//public interface PostsRepository extends JpaRepository<Posts, Long>{
//
//	@Modifying
//	@Query("update Posts p set p.view = p.view + 1 where p.id = :id")
//	int updateView(Long id);
//}
