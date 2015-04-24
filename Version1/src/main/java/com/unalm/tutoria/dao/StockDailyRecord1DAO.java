package com.unalm.tutoria.dao;


import com.unalm.tutoria.model.StockDailyRecord;
import com.unalm.tutoria.model.StockDailyRecord1;

public interface StockDailyRecord1DAO  extends GenericDAO<StockDailyRecord1>{
	StockDailyRecord1 findByCodigo(Long codigo);
	

}
