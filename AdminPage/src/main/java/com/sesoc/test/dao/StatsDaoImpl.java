package com.sesoc.test.dao;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sesoc.test.vo.Graph1VO;
import com.sesoc.test.vo.Graph2VO;
import com.sesoc.test.vo.Graph4VO;
import com.sesoc.test.vo.RankVO;
import com.sesoc.test.vo.StatVO;
import com.sesoc.test.vo.UserVO;

@Repository
public class StatsDaoImpl implements StatsDao {
	
	@Autowired
	private SqlSession sqlsession;

	//가장 인기 많은 제품
	@Override
	public ArrayList<RankVO> bestFurnitureList() {
		StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
		ArrayList<RankVO> list = mapper.bestFurnitureList();
		return list;
	}

	//성별, 연령별 인기 제품
	@Override
	   public ArrayList<RankVO> genFurnitureList(UserVO user) {
	      StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
	      ArrayList<RankVO> list = mapper.genFurnitureList(user);
	      return list;
	}
	
	@Override
	public ArrayList<StatVO> companyListAll(String stat) {
		// TODO Auto-generated method stub
		StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
		ArrayList<StatVO> listAll= mapper.companyListAll(stat);
		
		return listAll;
	}

	@Override
	public ArrayList<StatVO> companyStatistics(String coId) {
		StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
		ArrayList<StatVO> listAll= mapper.companyListAll(coId);
		return listAll;
	}


	@Override
	public ArrayList<Graph1VO> Graph1() {
		StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
		ArrayList<Graph1VO> list = mapper.Graph1();
		return list;
	}
	
	@Override
	public ArrayList<Graph2VO> Graph2() {
		StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
		ArrayList<Graph2VO> list = mapper.Graph2();
		return list;
	}
	
	@Override
	public ArrayList<Graph4VO> Graph4() {
		StatsMapper mapper = sqlsession.getMapper(StatsMapper.class);
		ArrayList<Graph4VO> list = mapper.Graph4();
		return list;
	}


	

}