package com.sesoc.test.dao;

import java.util.ArrayList;
import java.util.Map;

import com.sesoc.test.vo.CompanyVO;
import com.sesoc.test.vo.FurnitureVO;
import com.sesoc.test.vo.ImgVO;

public interface FileDao {

	public ArrayList<CompanyVO> find();

	public int fileSaved(FurnitureVO vo);

	public int companylibraryPaging(Map<String, String> libraryMap);

	public ArrayList<FurnitureVO>  companylibraryList(Map<String, String> libraryMap, int startRecord, int countPerPage);

	public int libraryPaging(Map<String, String> libraryMap);

	public ArrayList<FurnitureVO> libraryList(Map<String, String> libraryMap, int startRecord, int countPerPage);

	public FurnitureVO libraryRead(int furnitureNum);

	public FurnitureVO furniturDelete(int furnitureNum);
	
	public ArrayList<FurnitureVO> getFurnitureList();

	public void uploadImg(ImgVO imgVO);

}