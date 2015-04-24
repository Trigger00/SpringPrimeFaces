package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.Profesor;

public interface ProfesorDAO extends GenericDAO<Profesor> {

	Profesor findByCodigo(String codigo);
}
