package com.sesoc.test.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.sesoc.test.util.PageNavigator;
import com.sesoc.test.vo.FurnitureVO;
import com.sesoc.test.vo.ImgVO;

public interface FileService {

	public void find(Model model);

	public void fileSaved(FurnitureVO vo,List<MultipartFile> files, String path,String path1);

	public PageNavigator libraryNavi(int currentPage, Map<String, String> libraryMap);

	public ArrayList<FurnitureVO> getLibraryList(Map<String, String> libraryMap, PageNavigator libraryNavi);

	public FurnitureVO libraryRead(int furnitureNum);

	public FurnitureVO furniturnDelete(int furnitureNum, String path,String path1);

	public ArrayList<FurnitureVO> getFurnitureList();

	public void uploadImg(ImgVO imgVO);

}