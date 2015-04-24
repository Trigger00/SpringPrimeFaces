package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.CoordConsejeriaEntity;

public interface CoordConsejeriaDAO extends GenericDAO<CoordConsejeriaEntity>{
	CoordConsejeriaEntity findByCodigo(String codigo);

}
