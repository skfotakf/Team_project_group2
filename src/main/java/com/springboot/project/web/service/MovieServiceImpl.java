package com.springboot.project.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.web.mapper.MainListDAO;
import com.springboot.project.web.model.dto.MainListDto;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MainListDAO mainListDAO;
	
	private List<MainListDto> listAll;
	@Override // 메인 list
	public List<MainListDto> getListAll(int code) {
		System.out.println("되는중");
		return mainListDAO.getListAll(code);
	}
	@Override
	public List<MainListDto> getListAllRelease(int code) {
		
		return mainListDAO.getListAllRelease(code);
	}
	@Override
	public List<MainListDto> getListAllLike(int code) {
		// TODO Auto-generated method stub
		return mainListDAO.getListAllLike(code);
	}
	
	/* 정배열 역배열 버튼(못넣음)
	@Override
	public List<MainListDto> getListAllDesc(int code) {
		System.out.println("반대로 되는중");
		return mainListDAO.getListAllDesc(code);
	}
	@Override
	public List<MainListDto> getListAllReleaseDesc(int code) {
		// TODO Auto-generated method stub
		return mainListDAO.getListAllReleaseDesc(code);
	}
	@Override
	public List<MainListDto> getListAllLikeDesc(int code) {
		// TODO Auto-generated method stub
		return mainListDAO.getListAllLikeDesc(code);
	}
	*/
	
/*
	@Override
	public List<MainListDto> getList() {
		System.out.println("되는중!");
		listAll = getListAll();
		List<MainListDto> list = new ArrayList<MainListDto>();
		list.add(listAll.);
		return list;
	}
	*/
/*
	@Override // 조회수 증가
	public int plusMovieListCnt(String mov_idn) {
		return mainListDAO.plusMovieListCnt(Integer.parseInt(mov_idn));
	}
*/

}