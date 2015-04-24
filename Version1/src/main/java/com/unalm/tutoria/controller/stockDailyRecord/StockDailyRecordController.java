package com.unalm.tutoria.controller.stockDailyRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.controller.stock.StockService;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.StockDailyRecord;


@Controller
@RequestMapping("stockDailyRecord")
public class StockDailyRecordController {

	@Autowired
	StockDailyRecordService service;
	
	@RequestMapping(method= RequestMethod.GET)
	
	public String index(Model model){
		List<StockDailyRecord> stockDailyRecords = service.allStockDailyRecord();
		model.addAttribute("stockDailyRecords",stockDailyRecords);
		return "stockDailyRecord/index";
	}
	
}
