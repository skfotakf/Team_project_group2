package com.springboot.project.web.dto.movie;

import lombok.Builder;
import lombok.Data;

@Builder
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
	public float mov_gross;

	//movie_rating
	private int rating_mov_idn;
	private String rating_user_id;
	private int rating_rating;
}