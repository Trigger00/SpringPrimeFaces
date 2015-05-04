package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.ConsejeroNcstEntity;

public interface ConsejeroNcstDAO extends GenericDAO<ConsejeroNcstEntity>{
	ConsejeroNcstEntity findByCodigo(Long Codigo);
}
