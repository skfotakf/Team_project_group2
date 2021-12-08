package com.springboot.project.web.dto.movie;

import com.springboot.project.domain.movie.MovieReview;

import lombok.Data;

@Data
public class MovieReviewDto {

	private int mov_idn;
	private int number;
	private String content;
	private String createdate;
	private String updatedate;
	private String username;
	
	
	public MovieReview toEntity() {
		return MovieReview.builder()
				.mov_idn(mov_idn)
				.number(number)
				.content(content)
				.createdate(createdate)
				.updatedate(updatedate)
				.username(username)
				.build();
	}
}
