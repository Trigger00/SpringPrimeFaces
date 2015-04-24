package com.unalm.tutoria.controller.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.StockDAO;
import com.unalm.tutoria.model.Stock;

@Service
@Transactional
public class StockServiceImp implements StockService {

	@Autowired
	StockDAO stockDAO;

	public List<Stock> allStock() {

		return stockDAO.list();
	}

	public void setDao(StockDAO dao) {
		this.stockDAO = dao;
	}

}
