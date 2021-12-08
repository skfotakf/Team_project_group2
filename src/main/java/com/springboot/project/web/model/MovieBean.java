package com.springboot.project.web.model;

public class MovieBean {

	private int movieTotalCount;
	private int pageNumber;
	private int startIndex;
	private int endIndex;
	private int totalPage;
	private int startPage;
	private int endPage;
	
	public int getmovieTotalCount() {
		return movieTotalCount;
	}
	public void setmovieTotalCount(int movieTotalCount) {
		this.movieTotalCount = movieTotalCount;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex() {
		this.startIndex = (this.pageNumber-1) * 10;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex() {
		this.endIndex = this.pageNumber * 10;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage() {
		this.totalPage = this.movieTotalCount%10 == 0 ? this.movieTotalCount/10 : this.movieTotalCount/10 + 1;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage() {
		this.startPage = this.pageNumber%5 == 0 ? this.pageNumber - 4 : this.pageNumber - (this.pageNumber%5) + 1;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage() {
		this.endPage = this.startPage + 4 <= this.totalPage ? this.startPage + 4 : this.totalPage;
	}
	
	@Override
	public String toString() {
		return "movieBean [movieTotalCount=" + movieTotalCount + ", pageNumber=" + pageNumber + ", startIndex="
				+ startIndex + ", endIndex=" + endIndex + ", totalPage=" + totalPage + ", startPage=" + startPage
				+ ", endPage=" + endPage + "]";
	}
}
