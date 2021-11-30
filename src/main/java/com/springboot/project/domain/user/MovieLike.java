package com.springboot.project.domain.user;

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
	private String user_id; // 유저 아이디
	private int likeFlag; //유저가 좋아요를 눌렀는지 안눌렀는지
}
