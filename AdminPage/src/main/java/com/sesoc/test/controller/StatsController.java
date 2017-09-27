package com.sesoc.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sesoc.test.service.StatsService;
import com.sesoc.test.vo.Graph1VO;
import com.sesoc.test.vo.StatVO;

@Controller
@RequestMapping("/stats")
public class StatsController {

	@Autowired
	private StatsService service;

	//성별, 연령별 인기 제품
	@RequestMapping(value = "statistics", method=RequestMethod.GET)
	public String genFurnitureList() {
		return "statistics";
	}
	
	@RequestMapping(value="statistics", method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<StatVO> statistics(String stat){
		System.out.println(stat);
		return service.companyListAll(stat);
	
		
	}
	
	@RequestMapping(value="companyStatistics", method=RequestMethod.GET)
	public String companyStatistics(Model model, String coId){
		service.companyStatistics(model, coId);
		return "statistics";
	}


	
	//graph1(연도별)
	//성별, 연령별 인기 제품
		@RequestMapping(value = "graph1")
		public String graph1(Model model) {
			service.Graph1(model);
			return	"Graph1";	
		}
		
		@RequestMapping(value = "graph2")
		public String graph2(Model model) {
			service.Graph2(model);
			return	"Graph2";	
		}
		
		@RequestMapping(value = "graph3")
		public String graph3(Model model) {
			service.Graph2(model);
			return	"Graph3";	
		}
		
		@RequestMapping(value = "graph4")
		public String graph4(Model model) {
			service.Graph4(model);
			return	"Graph4";	
		}
		@RequestMapping(value = "graph5")
		public String graph5(Model model) {
			service.Graph4(model);
			return	"Graph5";	
		}
		@RequestMapping(value = "graph6")
		public String graph6(Model model) {
			service.Graph4(model);
			return	"Graph6";	
		}
		@RequestMapping(value = "graph7")
		public String graph7(Model model) {
			service.Graph4(model);
			return	"Graph7";	
		}
		@RequestMapping(value = "graph8")
		public String graph8(Model model) {
			service.Graph4(model);
			return	"Graph8";	
		}
		
	
	
}