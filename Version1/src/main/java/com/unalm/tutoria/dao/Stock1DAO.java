package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.Stock1;

public interface Stock1DAO extends GenericDAO<Stock1>{
	Stock findByCodigo(String codigo);

}
