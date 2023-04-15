package com.kong.king.spring.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@Builder
public class CommentDTO {
	private Long c_id;
	private String c_comment;
	private String c_writer;
	private String c_title;
	private String c_content;
	private Date c_regDate;
//	private String createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
//	private String modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
 
	
//	public Comment toEntity() {
//		Comment comments = Comment.builder()
//				.id(id)
//				.comment(comment)
//				.createdDate(createdDate)
//				.modifiedDate(modifiedDate)
////				.user(user)
//				.posts(posts)
//				.build();
//		
//		return comments;
//    }
}

