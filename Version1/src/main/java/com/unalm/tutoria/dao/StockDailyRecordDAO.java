package com.unalm.tutoria.dao;


import com.unalm.tutoria.model.StockDailyRecord;

public interface StockDailyRecordDAO  extends GenericDAO<StockDailyRecord>{
	StockDailyRecord findByCodigo(String codigo);
	

}
