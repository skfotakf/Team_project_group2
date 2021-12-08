package com.springboot.project.web.dto.movie;

import com.springboot.project.domain.movie.MovieRating;

import lombok.Data;

@Data
public class MovieRatingDto {

	private int mov_idn;
	private int number;
	private int rating;
	
	public MovieRating toEntity() {
		return MovieRating.builder()
				.mov_idn(mov_idn)
				.number(number)
				.rating(rating)
				.build();
	}
}
