package com.unalm.tutoria.controller.stockDailyRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.StockDailyRecordDAO;
import com.unalm.tutoria.model.StockDailyRecord;


@Service
@Transactional
public class StockDailyRecordServiceImp implements StockDailyRecordService {

	@Autowired
	StockDailyRecordDAO stockRecordDAO;
	
	public List<StockDailyRecord> allStockDailyRecord() {
	
		return stockRecordDAO.list();
	}

}
