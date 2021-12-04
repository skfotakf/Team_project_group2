package com.springboot.project.web.dto.movie;

import com.springboot.project.domain.movie.MovieLike;

import lombok.Data;

@Data
public class MovieLikeDto {
	
	private int mov_idn;
	private int number;

	
	public MovieLike toEntity() {
		return MovieLike.builder()
				.mov_idn(mov_idn)
				.number(number)
				.build();
	}

	
}
