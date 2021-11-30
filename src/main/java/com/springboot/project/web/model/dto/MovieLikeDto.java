package com.springboot.project.web.model.dto;

import com.springboot.project.domain.user.MovieLike;

import lombok.Data;

@Data
public class MovieLikeDto {
	
	private int mov_idn;
	private String user_id;

	
	public MovieLike toEntity() {
		return MovieLike.builder()
				.mov_idn(mov_idn)
				.user_id(user_id)
				.build();
	}

	
}
