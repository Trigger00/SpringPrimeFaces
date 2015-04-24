package com.unalm.tutoria.controller.profesor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.ProfesorDAO;
import com.unalm.tutoria.model.Profesor;


@Service
@Transactional
public class ProfesorServiceImp implements ProfesorService {

	@Autowired
	ProfesorDAO profesorDAO;
	
	public List<Profesor> allProfesor() {
		return profesorDAO.list();
	}




}
