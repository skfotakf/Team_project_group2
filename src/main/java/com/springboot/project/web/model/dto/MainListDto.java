package com.springboot.project.web.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MainListDto {
	
	
	//movie_mst
	private int mov_idn;  // 영화 아이디	
	private String mov_photo; // 영화 포스터
	private String mov_title; // 영화 제목
	private String mov_release; // 영화 개봉 날짜
	private int mov_viewCnt; // 영화 조회수
	private int mov_gnr; // 영화 장르
	private float mov_rat; // 영화 평점
	private int mov_rat_cnt; // 영화 평점 참가수
	private int mov_lik; // 영화 좋아요
	private int mov_lik_cnt; // 영화 좋아요 수
	private int mov_gnr_idn; // 영화 장르 아이디
	private int mov_cht_idn; // 영화 차트 아이디
	private int mov_viw_list_idn; // 영화 좋아요 아이디
	private int number; // 회원 넘버
	public int getMov_idn() {
		return mov_idn;
	}
	public void setMov_idn(int mov_idn) {
		this.mov_idn = mov_idn;
	}
	public String getMov_photo() {
		return mov_photo;
	}
	public void setMov_photo(String mov_photo) {
		this.mov_photo = mov_photo;
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
	public int getMov_gnr() {
		return mov_gnr;
	}
	public void setMov_gnr(int mov_gnr) {
		this.mov_gnr = mov_gnr;
	}
	public float getMov_rat() {
		return mov_rat;
	}
	public void setMov_rat(float mov_rat) {
		this.mov_rat = mov_rat;
	}
	public int getMov_rat_cnt() {
		return mov_rat_cnt;
	}
	public void setMov_rat_cnt(int mov_rat_cnt) {
		this.mov_rat_cnt = mov_rat_cnt;
	}
	public int getMov_lik() {
		return mov_lik;
	}
	public void setMov_lik(int mov_lik) {
		this.mov_lik = mov_lik;
	}
	public int getMov_lik_cnt() {
		return mov_lik_cnt;
	}
	public void setMov_lik_cnt(int mov_lik_cnt) {
		this.mov_lik_cnt = mov_lik_cnt;
	}
	public int getMov_gnr_idn() {
		return mov_gnr_idn;
	}
	public void setMov_gnr_idn(int mov_gnr_idn) {
		this.mov_gnr_idn = mov_gnr_idn;
	}
	public int getMov_cht_idn() {
		return mov_cht_idn;
	}
	public void setMov_cht_idn(int mov_cht_idn) {
		this.mov_cht_idn = mov_cht_idn;
	}
	public int getMov_viw_list_idn() {
		return mov_viw_list_idn;
	}
	public void setMov_viw_list_idn(int mov_viw_list_idn) {
		this.mov_viw_list_idn = mov_viw_list_idn;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "MainListDto [mov_idn=" + mov_idn + ", mov_photo=" + mov_photo + ", mov_title=" + mov_title
				+ ", mov_release=" + mov_release + ", mov_viewCnt=" + mov_viewCnt + ", mov_gnr=" + mov_gnr
				+ ", mov_rat=" + mov_rat + ", mov_rat_cnt=" + mov_rat_cnt + ", mov_lik=" + mov_lik + ", mov_lik_cnt="
				+ mov_lik_cnt + ", mov_gnr_idn=" + mov_gnr_idn + ", mov_cht_idn=" + mov_cht_idn + ", mov_viw_list_idn="
				+ mov_viw_list_idn + ", number=" + number + "]";
	}
	
	

}
