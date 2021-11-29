package com.springboot.project.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.web.mapper.MainChartDao;
import com.springboot.project.web.model.dto.MainChartDto;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MainChartDao mainChartDao;
	
	private List<MainChartDto> chartAll;
	@Override // 메인 list
	public List<MainChartDto> getChartAll(int code) {
		System.out.println("되는중");
		return mainChartDao.getChartAll(code);
	}
	@Override
	public List<MainChartDto> getChartAllRelease(int code) {
		
		return mainChartDao.getChartAllRelease(code);
	}
	@Override
	public List<MainChartDto> getChartAllLike(int code) {
		// TODO Auto-generated method stub
		return mainChartDao.getChartAllLike(code);
	}
	
	/* 정배열 역배열 버튼(못넣음)
	@Override
	public List<MainChartDto> getChartAllDesc(int code) {
		System.out.println("반대로 되는중");
		return mainChartDao.getChartAllDesc(code);
	}
	@Override
	public List<MainChartDto> getChartAllReleaseDesc(int code) {
		// TODO Auto-generated method stub
		return mainChartDao.getChartAllReleaseDesc(code);
	}
	@Override
	public List<MainChartDto> getChartAllLikeDesc(int code) {
		// TODO Auto-generated method stub
		return mainChartDao.getChartAllLikeDesc(code);
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