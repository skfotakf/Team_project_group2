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
	public List<MainListDto> getListAll() {
		System.out.println("되는중");
		return mainListDAO.getListAll();
	}
	
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