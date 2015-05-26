package com.unalm.tutoria.controller.consejeroNcst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.ConsejeroNcstDAO;
import com.unalm.tutoria.model.ConsejeroNcstEntity;

@Service("consejero1")
public class ConsejeroNcstServiceImp implements ConsejeroNcstService {

	@Autowired
	ConsejeroNcstDAO consejeroNcstDAO;

	public void guardarConsejero(ConsejeroNcstEntity consejeroNcst) {

		System.out.println("ENTRO AL SERVIS");
		System.out.println("EL VALOR INGRESADO" + " - "+ consejeroNcst.getMatricula() );
		System.out.println("ENTRO PARA GUARDAR");
		consejeroNcstDAO.save(consejeroNcst);
		//consejeroNcstDAO.update(consejeroNcst);

	}

	public List<ConsejeroNcstEntity> allConsejeroNcst() {
		 
		return consejeroNcstDAO.list();
	}

	public void deleteConsejeroNcst(Long id) {
		consejeroNcstDAO.delete(id);
		
	}

	public ConsejeroNcstEntity findConsejeroNcst(Long id) {
		return consejeroNcstDAO.findByCodigo(id);
	}

}
