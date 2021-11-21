package com.springboot.project.movie.commons.paging;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

// 게시글 하단 번호처리
public class PageMaker {
	
	private int totalCount; // 전체 게시글 수 
	private int startPage;  // 게시글 번호에 따른 페이지의 시작번호
	private int endPage;  // 게시글 번호에 따른 페이지의 마지막번호
	private boolean prev; // 이전 버튼을 누를 수 있는 경우/없는 경우 분류를 위해서
	private boolean next;
	private int tempEndPage; // 실제 데이터 수에 필요한 페이지
	
	private int displayPageNum = 10; // 하단 페이지 번호의 갯수 
	
	private Criteria criteria; 
	
	/*=======================================================================*/
	
	public void setCriteria(Criteria criteria) { 
		this.criteria = criteria; 
	} 
	
	public void setTotalCount(int totalCount) { 
		this.totalCount = totalCount; 
		calcData();  // 전체 필드 변수들 세팅: 전체 게시글 수의 setter가 호출될 때 전체 세팅되도록
	} 
	
		// 게시글의 전체 갯수가 결정되면 calcData 메소드를 호출하여 계산 실행 
	private void calcData() { 
		
		// 마지막 페이지의 넘버 = 15페이지가 마지막? / 10 = 1.5 -> 반올림 2 -> 2 * 10 -> 20
		endPage = (int) (Math.ceil(criteria.getPage() / (double) displayPageNum) * displayPageNum); 
		// 위의 endpage가 20이면 -> 20 - 10 + 1 = 11
		startPage = (endPage - displayPageNum) + 1;
		
		tempEndPage = (int) (Math.ceil(totalCount / (double) criteria.getPerPageNum())); 
		
		if (endPage > tempEndPage) { 
			endPage = tempEndPage; 
		}
		
		prev = startPage == 1 ? false : true;  // 1페이지면 누를수 없도록
		
		next = endPage * criteria.getPerPageNum() >= totalCount ? false : true; 
	}
	
	public String makeQuery(int page) {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("perPageNum", criteria.getPerPageNum())
				.build();
		
		return uriComponents.toUriString();
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTempEndPage() {
		return tempEndPage;
	}

	public void setTempEndPage(int tempEndPage) {
		this.tempEndPage = tempEndPage;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public Criteria getCriteria() {
		return criteria;
	}

}