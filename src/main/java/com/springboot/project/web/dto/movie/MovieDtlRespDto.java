package com.springboot.project.web.dto.movie;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MovieDtlRespDto {

	private int mov_idn;
	private String mov_photo;
	private String mov_title;
	private String mov_release;
	private String mov_gnr;
	private String mov_rat;
	private String mov_trailer;
	private String mov_date;
	private int mov_age;
	private String mov_runtime;
	private String mov_story;
	private String mov_director;
	private String mov_actor;
	private String mov_actorchar;
	private String wl_mov_idn;
	private int number;
	
}
