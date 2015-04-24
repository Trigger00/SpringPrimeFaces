package com.unalm.tutoria.controller.alumnos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.AlumnosDAO;
import com.unalm.tutoria.model.AlumnosEntity;


@Service
@Transactional
public class AlumnosServiceImp implements AlumnosService{

	@Autowired
	AlumnosDAO alumnosDAO;
	
	public List<AlumnosEntity> allAlumnos() {
		
		return alumnosDAO.list();
	}

	
}
