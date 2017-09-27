package com.sesoc.test.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sesoc.test.vo.CompanyVO;
import com.sesoc.test.vo.FurnitureVO;
import com.sesoc.test.vo.ImgVO;

@Repository
public class FileDaoImpl implements FileDao {
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public ArrayList<CompanyVO> find() {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		return mapper.find();
	}

	@Override
	public int fileSaved(FurnitureVO vo) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		return mapper.fileSaved(vo);
	}
	
	@Override
	public int libraryPaging(Map<String, String> libraryMap) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		return mapper.libraryPaging(libraryMap);
	}

	@Override
	public ArrayList<FurnitureVO> libraryList(Map<String, String> libraryMap, int startRecord, int countPerPage) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		RowBounds libraryRb = new RowBounds(startRecord, countPerPage);
		return mapper.libraryList(libraryMap, libraryRb);
	}

	@Override
	public int companylibraryPaging(Map<String, String> libraryMap) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		return mapper.companylibraryPaging(libraryMap);
	}

	@Override
	public ArrayList<FurnitureVO> companylibraryList(Map<String, String> libraryMap, int startRecord,
			int countPerPage) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		RowBounds libraryRb = new RowBounds(startRecord, countPerPage);
		return mapper.companylibraryList(libraryMap, libraryRb);
	}
	
	@Override
	public FurnitureVO libraryRead(int furnitureNum) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		return mapper.libraryRead(furnitureNum);
	}

	@Override
	public FurnitureVO furniturDelete(int furnitureNum) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		FurnitureVO result=mapper.libraryRead(furnitureNum);		
		mapper.furniturnDelete(furnitureNum);
		return result;
	}

	@Override
	public ArrayList<FurnitureVO> getFurnitureList() {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		return mapper.getFurnitureList(); 
	}

	@Override
	public void uploadImg(ImgVO imgVO) {
		FileMapper mapper = sqlsession.getMapper(FileMapper.class);
		mapper.uploadImg(imgVO);
		
	}

}