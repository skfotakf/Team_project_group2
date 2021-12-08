package com.springboot.project.domain.movie;

import com.springboot.project.web.dto.movie.MovieReviewDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieReview {
	private int mov_idn;
	private int number;
	private String content;
	private String createdate;
	private String updatedate;
	private String username;
}
