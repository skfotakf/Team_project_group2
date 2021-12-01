package com.springboot.project.web.dto.movie;

import com.springboot.project.domain.user.MovieRating;

import lombok.Data;

@Data
public class MovieRatingDto {

	private int mov_idn;
	private String user_id;
	private int rating;
	
	public MovieRating toEntity() {
		return MovieRating.builder()
				.mov_idn(mov_idn)
				.user_id(user_id)
				.rating(rating)
				.build();
	}
}
