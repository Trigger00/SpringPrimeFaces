package com.unalm.tutoria.controller.coordConsejeria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.CoordConsejeriaDAO;
import com.unalm.tutoria.model.CoordConsejeriaEntity;


@Service
@Transactional
public class coordConsejeriaServiceImp implements coordConsejeriaService{
	@Autowired
	CoordConsejeriaDAO coordConsejeriaDAO;
	
	public List<CoordConsejeriaEntity> allCoordinador(){
		return coordConsejeriaDAO.list();
		
	}
	

}
