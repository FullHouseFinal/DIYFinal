package com.sesoc.test.dao;

import java.util.ArrayList;

import com.sesoc.test.vo.Graph1VO;
import com.sesoc.test.vo.Graph2VO;
import com.sesoc.test.vo.Graph4VO;
import com.sesoc.test.vo.RankVO;
import com.sesoc.test.vo.StatVO;
import com.sesoc.test.vo.UserVO;

public interface StatsDao {

	public ArrayList<RankVO> bestFurnitureList();//가장 인기 많은 제품
	
	public ArrayList<RankVO> genFurnitureList(UserVO user);//성별, 연령별 인기 제품

	public ArrayList<Graph1VO> Graph1();
	
	public ArrayList<Graph2VO> Graph2();
	
	public ArrayList<Graph4VO> Graph4();

	public ArrayList<StatVO> companyListAll(String stat);

	public ArrayList<StatVO> companyStatistics(String coId);

}