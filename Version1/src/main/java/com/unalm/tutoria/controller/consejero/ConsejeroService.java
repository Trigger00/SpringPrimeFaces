package com.unalm.tutoria.controller.consejero;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.unalm.tutoria.model.ConsejeriaEntity;
//@Component
//@Transactional

//@Service("ConsejeroService")
public interface ConsejeroService {
	List<ConsejeriaEntity> allConsejero();
	/*
	 void guardarConsejero(ConsejeriaEntity consejero);
*/
}