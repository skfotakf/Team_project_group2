package com.springboot.project.domain.movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MovieLike {
	private int mov_idn;  // 영화 아이디	
	private int number; // 유저 아이디

}
