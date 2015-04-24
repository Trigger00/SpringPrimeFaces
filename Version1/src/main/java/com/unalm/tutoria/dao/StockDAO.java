package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.Stock;

public interface StockDAO extends GenericDAO<Stock>{
	Stock findByCodigo(String codigo);

}
