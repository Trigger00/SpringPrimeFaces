package com.unalm.tutoria.controller.consejero;

import java.util.Collection;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.model.ConsejeriaEntity;

@Controller
@RequestMapping("consejero")
@ManagedBean
@ApplicationScoped
public class ConsejeroController {

	
	
	
	
	private List<ConsejeriaEntity> consejeriaEntity;
	


	public List<ConsejeriaEntity> getConsejeriaEntity() {
		return consejeriaEntity;
	}

	public void setConsejeriaEntity(List<ConsejeriaEntity> consejeriaEntity) {
		this.consejeriaEntity = consejeriaEntity;
	}

	@Autowired
	ConsejeroService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<ConsejeriaEntity> consejeros = service.allConsejero();
		consejeriaEntity = consejeros;
		System.out.println("YA SALE "+consejeriaEntity.get(0).getCiclo());
		model.addAttribute("consejeros", consejeros);
		return "consejero/index";
		
		
	

	}
}
