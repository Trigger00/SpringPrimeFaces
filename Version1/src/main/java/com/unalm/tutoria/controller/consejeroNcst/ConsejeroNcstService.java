package com.unalm.tutoria.controller.consejeroNcst;

import java.util.List;

import com.unalm.tutoria.model.ConsejeroNcstEntity;

public interface ConsejeroNcstService {
	List<ConsejeroNcstEntity> allConsejeroNcst();
	
	ConsejeroNcstEntity findConsejeroNcst(Long id);

	void guardarConsejero(ConsejeroNcstEntity consejeroNcst);

	void deleteConsejeroNcst(Long id);
}
