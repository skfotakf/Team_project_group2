package com.springboot.project.movie.commons.paging;

// 한 페이지에 보여줄 게시글 수 
public class Criteria { 
	
	private int page; // 보여줄 페이지
	private int perPageNum; // 페이지당 보여줄 페이지 수 
	
	 // 최초 default생성자로 기본 객체 생성시 초기값을 정한다(1페이지, 10개씩) 
	public Criteria() {
		this.page = 1;  // 사용자가 세팅하지 않으면 기본 1
		this.perPageNum = 10; // 페이지당 기본 10개씩 출력하도록 세팅
	} 
	
	// setter, getter
	public void setPage(int page) { 
		
		if (page <= 0) { 
			// 페이지는 1페이지부터임으로 0보다 작거나 같은 값일경우 무조건 첫번째 페이지로 설정
			this.page = 1; 
			return; 
		} else {
			this.page = page;
		}
	} 
	
	public int getPage() { 
		return page; 
	} 
	
	public void setPerPageNum(int perPageNum) { 
		
		if (perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10; 
			return; 
		} 
		
		this.perPageNum = perPageNum; 
	} 
	
	public int getPerPageNum() {
		return this.perPageNum; 
	} 
	
	// limit 구문에서 시작 부분에 필요한 값을 반환(mybatis에서 사용)
	public int getPageStart() { 
		return (this.page - 1) * this.perPageNum;
	} 
	
	@Override public String toString() { 
		return "Criteria [page=" + page + ", perPageNum="+ perPageNum+"]" ; 
	} 
}