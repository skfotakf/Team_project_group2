package com.springboot.project.movie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.project.movie.model.dto.LikeUpdateDto;
import com.springboot.project.movie.model.dto.MovieListDto;
import com.springboot.project.movie.model.vo.MovieVO;

@Mapper
public interface MovieListDAO {

	public List<MovieVO> listAll(); // 모든 영화 리스트 불러오기
	// 좋아요 관련
	public int likeLoginCheck(MovieVO movieVO); // 좋아요 체크표시 유무??
			// 만약 회원넘버가 null이라면 하트를 전부다 비운다 mov_lik -> 0
	// ajax 사용 예정   
	public int likeCheck(LikeUpdateDto likeUpdateDto);  // 좋아요 클릭시 총 좋아요 증가, 하트 채워짐
	public int likeCheckCancel(LikeUpdateDto likeUpdateDto); // 좋아요 취소시 총 좋아요 감소, 하트 비워짐
	
	/*
	 * 계획
	 * 	유저가 로그인함 (number 가지고있음)
		-> 이 유저가 평가하고자 하는 리스트 봤다!  ok
		-> 이 유저가 이 영화를 평가했는지 체크? y?n?  ok
		-> y??? 평가했으면 한번더 누르면 평가 취소  
		-> n?? 평가를 안했으면 할 수 있어
		한번 클릭시 그냥 봤어
		옆에 별을 선택하면 별 평가 완료 -> 이때 별 갯수 int 전달
	 */
	
	// 별점 평가 관련 -> 좋아요와 비슷하다?!!

}
