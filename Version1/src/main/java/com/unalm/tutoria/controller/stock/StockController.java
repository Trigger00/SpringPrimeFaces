package com.unalm.tutoria.controller.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.controller.stockDailyRecord.StockDailyRecordService;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.StockDailyRecord;

@Controller
@RequestMapping("stock")
public class StockController {

	@Autowired
	StockService service;
	
	@Autowired
	StockDailyRecordService service2;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model){
		List<Stock> stocks = service.allStock();
		model.addAttribute("stocks",stocks);
		
		/*
		List<StockDailyRecord> stockDailyRecords = service2.allStockDailyRecord();
		model.addAttribute("stockDailyRecord2",stockDailyRecords);
		
		*/
		return "stock/index";
	}
	
}
