package com.kong.king.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//import lombok.*;

@Entity
@Table(name="comments")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long c_id;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String c_comment;
	
//	@Column(name = "created_date")
//	@CreatedDate
//	private String createdDate;
//	
//	@Column(name = "modified_date")
//	@LastModifiedDate
//	private String modifiedDate;
	
//	@ManyToOne
//	@JoinColumn(name = "posts_id")
//	private Posts posts;
//	
//	@ManyToOne
//	@JoinColumn( name = "user_id")
//	private User user;
	
	/* Post */
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long mid;
	
	@Column(length=30, nullable=false)
	private String c_writer;
	
	@Column(length=30, nullable=false)
	private String c_title;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String c_content;

	@Column
	private Date c_regDate;
	
	
}
