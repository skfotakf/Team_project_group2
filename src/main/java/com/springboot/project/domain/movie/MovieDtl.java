package com.springboot.project.domain.movie;

import java.util.Date;

import com.springboot.project.web.dto.movie.MovieDtlRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDtl {

	private int mov_idn;
	private String mov_photo;
	private String mov_title;
	private Date mov_release;
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
	
	public MovieDtlRespDto toEntity() {
		return MovieDtlRespDto.builder()
						.mov_idn(mov_idn)
						.mov_photo(mov_photo)
						.mov_title(mov_title)
						.mov_release(mov_release.toString().substring(0,4))
						.mov_gnr(mov_gnr)
						.mov_rat(mov_rat)
						.mov_trailer(mov_trailer)
						.mov_date(mov_date)
						.mov_age(mov_age)
						.mov_runtime(mov_runtime)
						.mov_story(mov_story)
						.mov_director(mov_director)
						.mov_actor(mov_actor)
						.mov_actorchar(mov_actorchar)
						.wl_mov_idn(wl_mov_idn)
						.number(number)
						.build();
	}
}
