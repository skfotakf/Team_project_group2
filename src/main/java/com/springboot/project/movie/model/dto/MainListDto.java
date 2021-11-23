package com.springboot.project.movie.model.dto;

import lombok.Getter;
import lombok.Setter;

public class MainListDto {
	
	
	//movie_mst
	private int mov_idn;  // 영화 아이디	
	private String mov_title; // 영화 제목
	private String mov_release; // 영화 개봉 날짜
	private int mov_viewCnt; // 영화 조회수
	private int mov_lik_idn; // 영화 좋아요 아이디
	private int mov_rat_idn; // 영화 별점 아이디
	
	public int getMov_idn() {
		return mov_idn;
	}

	public void setMov_idn(int mov_idn) {
		this.mov_idn = mov_idn;
	}

	public String getMov_title() {
		return mov_title;
	}

	public void setMov_title(String mov_title) {
		this.mov_title = mov_title;
	}

	public String getMov_release() {
		return mov_release;
	}

	public void setMov_release(String mov_release) {
		this.mov_release = mov_release;
	}

	public int getMov_viewCnt() {
		return mov_viewCnt;
	}

	public void setMov_viewCnt(int mov_viewCnt) {
		this.mov_viewCnt = mov_viewCnt;
	}

	public int getMov_lik_idn() {
		return mov_lik_idn;
	}

	public void setMov_lik_idn(int mov_lik_idn) {
		this.mov_lik_idn = mov_lik_idn;
	}

	public int getMov_rat_idn() {
		return mov_rat_idn;
	}

	public void setMov_rat_idn(int mov_rat_idn) {
		this.mov_rat_idn = mov_rat_idn;
	}

	@Override
	public String toString() {
		return "MainListDto [mov_idn=" + mov_idn + ", mov_title=" + mov_title + ", mov_release=" + mov_release
				+ ", mov_viewCnt=" + mov_viewCnt + ", mov_lik_idn=" + mov_lik_idn + ", mov_rat_idn=" + mov_rat_idn
				+ "]";
	}
	
	

}
