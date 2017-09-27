package com.sesoc.test.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.sesoc.test.vo.Graph1VO;
import com.sesoc.test.vo.StatVO;
import com.sesoc.test.vo.UserVO;

public interface StatsService {

	public void bestFurnitureList(Model model);//가장 인기 많은 제품
	
	public void genFurnitureList(Model model, UserVO user);
	

	public void Graph1(Model model);
	
	public void Graph2(Model model);
	
	public void Graph4(Model model);

	public ArrayList<StatVO> companyListAll(String stat);

	public void companyStatistics(Model model, String coId);

}