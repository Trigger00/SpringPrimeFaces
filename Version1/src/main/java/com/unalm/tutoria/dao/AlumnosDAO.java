package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.AlumnosEntity;

public interface AlumnosDAO extends GenericDAO<AlumnosEntity>{
	
	AlumnosEntity findByCodigo(String Codigo);

}
