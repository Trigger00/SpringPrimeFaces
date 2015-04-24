package com.unalm.tutoria.dao;

import com.unalm.tutoria.model.Programa;

public interface ProgramaDAO extends GenericDAO<Programa>{
    
    
    Programa findByCodigo(String codigo);
    
}
