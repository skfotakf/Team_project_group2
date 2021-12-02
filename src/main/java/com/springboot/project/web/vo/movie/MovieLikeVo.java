package com.springboot.project.web.vo.movie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieLikeVo {

	private String user_number;
	private int mov_idn;
	private int likeFlag;
}
