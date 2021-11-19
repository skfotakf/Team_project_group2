package com.springboot.project.movie.domain;


public class MovieVO {

	//movie_mst
	private int movie_no; // 게시글 넘버
	private String title; // 제목
	private String content; // 디테일 내용?? 페이지 이동이라 내용이 더 필요한지 모르겠음
	private String movie_date; // 개봉일자
	private int viewcnt; // 조회수
	
	public int getMovie_no() {
		return movie_no;
	}
	public void setMovie_no(int movie_no) {
		this.movie_no = movie_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMovie_date() {
		return movie_date;
	}
	public void setMovie_date(String movie_date) {
		this.movie_date = movie_date;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	@Override
	public String toString() {
		return "MovieVO [movie_no=" + movie_no 
					+ ", title=" + title 
					+ ", content=" + content 
					+ ", movie_date=" + movie_date 
					+ ", viewcnt=" + viewcnt + "]";
	}
	
	
}
