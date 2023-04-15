package com.kong.king.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kong.king.spring.entity.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long> {
//	
//	List<MemoBoard> findByMidBetweenOrderByMidDesc(Long from, Long to);
//	Page<MemoBoard> findByMidBetween(Long from, Long to, Pageable pageable);
	
//	@Query("select m from MemoBoard m order by m.mid desc")
//	List<MemoBoard> getMemoBoardListAllDesc();
//	
//	@Transactional
//	@Modifying
//	@Query("update MemoBoard m set m.content= :content where m.mid = :mid ")
//	int updateMemoBoardContentWithMid(@Param("mid") Long mid, @Param("content") String content);
//	
//	@Transactional
//	@Modifying
//	@Query("update MemoBoard m set m.content= :#{#param.content} where m.mid = :#{#param.mid} ")
//	int updateMemoBoardContentWithObj(@Param("param") MemoBoard memo);
	
//	@Query(value="select m from MemoBoard m where m.mid > :mid",
//			countQuery = "select count(m) from MemoBoard m where m.mid > :mid" )
//	Page<MemoBoard> getListWithQueryandPaging(Long mid, Pageable pageable);
	
	
//	@Query(value="select m.mid, m.content, CURRENT_DATE from MemoBoard m where m.mid > :mid",
//			countQuery = "select count(m) from MemoBoard m where m.mid > :mid" )
//	Page<Object[]> getListWithQueryObject(Long mid, Pageable pageable);
	
//	@Query(value="select * from memoboard where content like '%7%' ", nativeQuery=true)
//	List<MemoBoard> getNativeResult();
}
