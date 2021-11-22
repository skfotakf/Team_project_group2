package com.springboot.project.movie.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContentLikeDAO {

	//게시글 좋아요
	void contentLike(int movie_no) throws Exception;
	
}
