package com.sesoc.test.dao;

import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.sesoc.test.vo.CompanyVO;
import com.sesoc.test.vo.FurnitureVO;
import com.sesoc.test.vo.ImgVO;

public interface FileMapper {

	public ArrayList<CompanyVO> find();

	public int fileSaved(FurnitureVO vo);

	public ArrayList<FurnitureVO> furnitureList(String coNAME);

	public int libraryPaging(Map<String, String> libraryMap);

	public ArrayList<FurnitureVO> libraryList(Map<String, String> libraryMap, RowBounds libraryRb);

	public int companylibraryPaging(Map<String, String> libraryMap);

	public ArrayList<FurnitureVO> companylibraryList(Map<String, String> libraryMap, RowBounds libraryRb);

	public FurnitureVO libraryRead(int furnitureNum);

	public int furniturnDelete(int furnitureNum);

	public ArrayList<FurnitureVO> getFurnitureList();

	public void uploadImg(ImgVO imgVO);
	
}