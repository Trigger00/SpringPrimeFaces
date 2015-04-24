package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.ConsejeriaEntity;

public interface ConsejeroDAO extends GenericDAO<ConsejeriaEntity>{
	ConsejeriaEntity findByCodigo(String Codigo);

}
