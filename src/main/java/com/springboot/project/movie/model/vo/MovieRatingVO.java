package com.springboot.project.movie.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieRatingVO {
	
		// movie_rating
		private int mov_idn; // 영화 아이디
		private int number; // 회원 아이디
		private char mov_rat_cilck; // 별점 클릭시


}
