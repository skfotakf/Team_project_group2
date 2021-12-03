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
	private int mov_gnr1;
	private int mov_gnr2;
	private int mov_gnr3;
	private String mov_rat;
	private String mov_trailer;
	private int mov_age;
	private String mov_runtime;
	private String mov_story;
	private String mov_director;
	private String mov_actor;
	private String mov_actorchar;
	private String wl_mov_idn;
	private int number;
	
	// 장르 
	private int gen_num;
	private String genre;
	private String mg_genre1;
	private String mg_genre2;
	private String mg_genre3;
	
}
