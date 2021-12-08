package com.springboot.project.web.dto.movie;

import com.springboot.project.domain.movie.MovieDtl;

import lombok.Builder;
import lombok.Data;

// @Builder
@Data
public class MovieDtlRespDto {

	//movie_mst, movie_dtl
	private int mov_idn;
	private String mov_photo;
	private String mov_title;
	private String mov_release;
	private float mov_rat;
	private int mov_lik_cnt;
	private String mov_trailer;
	private int mov_age;
	private String mov_runtime;
	private String mov_story;
	private String mov_director;
	private String mov_actor;
	private String mov_actorchar;
	private float mov_gross;
	private int wl_mov_idn;
	private int number;
	private int like_number;
	private int rating_number;
	private int rating_rating;
	
	// 장르 
	private int gen_num;
	private String genre;
	private int mov_gnr1;
	private String mg_genre1;
	private int mov_gnr2;
	private String mg_genre2;
	private int mov_gnr3;
	private String mg_genre3;
	
	// 전문가 리뷰

	private String mov_expertReview;
	
	public MovieDtl toEntity() {
		return MovieDtl.builder()
				.mov_idn(mov_idn)
				.mov_photo(mov_photo)
				.mov_title(mov_title)
				.mov_release(mov_release.toString().substring(0,4))
				.mov_gnr1(mov_gnr1)
				.mg_genre1(mg_genre1)
				.mov_gnr2(mov_gnr2)
				.mg_genre2(mg_genre2)
				.mov_gnr3(mov_gnr3)
				.mg_genre3(mg_genre3)
				.mov_rat(mov_rat)
				.mov_lik_cnt(mov_lik_cnt)
				.mov_trailer(mov_trailer)
				.mov_age(mov_age)
				.mov_runtime(mov_runtime)
				.mov_story(mov_story)
				.mov_director(mov_director)
				.mov_actor(mov_actor)
				.mov_actorchar(mov_actorchar)
				.mov_gross(mov_gross)
				.ml_mov_idn(wl_mov_idn)
				.number(number)
				.like_number(like_number)
				.rating_number(rating_number)
				.rating_rating(rating_rating)
				.gen_num(gen_num)
				.genre(genre)
				.mov_expertReview(mov_expertReview)
				.build();
	}
	
}
