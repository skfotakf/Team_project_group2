package com.springboot.project.domain.movie;

import java.util.Date;

import com.springboot.project.web.dto.movie.MovieDtlRespDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieGenre {

	private int gen_num;
	private String genre;
	
	
}
