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
	private int gen_num;
	private String genre;
	private String mg_genre1;
	private String mg_genre2;
	private String mg_genre3;
	
	public MovieDtlRespDto toEntity() {
		return MovieDtlRespDto.builder()
						.mov_idn(mov_idn)
						.mov_photo(mov_photo)
						.mov_title(mov_title)
						.mov_release(mov_release.toString().substring(0,4))
						.mov_gnr1(mov_gnr1)
						.mov_gnr2(mov_gnr2)
						.mov_gnr3(mov_gnr3)
						.mov_rat(mov_rat)
						.mov_trailer(mov_trailer)
						.mov_age(mov_age)
						.mov_runtime(mov_runtime)
						.mov_story(mov_story)
						.mov_director(mov_director)
						.mov_actor(mov_actor)
						.mov_actorchar(mov_actorchar)
						.wl_mov_idn(wl_mov_idn)
						.number(number)
						.gen_num(gen_num)
						.genre(genre)
						.mg_genre1(mg_genre1)
						.mg_genre2(mg_genre2)
						.mg_genre3(mg_genre3)
						.build();
	}
}
