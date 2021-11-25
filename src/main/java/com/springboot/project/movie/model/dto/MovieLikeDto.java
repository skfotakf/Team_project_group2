package com.springboot.project.movie.model.dto;

import lombok.Getter;
import lombok.Setter;

public class MovieLikeDto {
	
	@Getter
	@Setter
	private int mov_idn;
	private int number;
	
	public MovieLikeDto() {
		super();
		this.mov_idn = mov_idn;
		this.number = number;
	}

	
}
