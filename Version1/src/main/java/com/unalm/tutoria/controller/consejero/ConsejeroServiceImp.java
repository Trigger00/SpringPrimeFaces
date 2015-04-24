package com.unalm.tutoria.controller.consejero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.model.ConsejeriaEntity;


@Service
@Transactional
public class ConsejeroServiceImp  implements ConsejeroService{

	@Autowired
	ConsejeroDAO consejeroDAO;
	
	public List<ConsejeriaEntity> allConsejero() {
		return consejeroDAO.list();
	}
	

}
