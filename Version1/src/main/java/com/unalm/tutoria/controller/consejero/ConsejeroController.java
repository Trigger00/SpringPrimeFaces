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
/*@ManagedBean
@ApplicationScoped*/
public class ConsejeroController {

	// private List<ConsejeriaEntity> consejeriaEntity;

	@Autowired
	ConsejeroService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<ConsejeriaEntity> consejeros = service.allConsejero();
		// consejeriaEntity = consejeros;
		// System.out.println("YA SALE "+" ---- "+consejeriaEntity.get(0).getCiclo());

		// +" - "+consejeriaEntity.get(0).getProfesor().getPro_codigo());
		model.addAttribute("consejeros", consejeros);
		return "consejero/index";

	}
	
	/*
	@RequestMapping("nuevo")
	public String nuevo(Model model) {
		model.addAttribute("consejero", new ConsejeriaEntity());
		return "programa/formulario";
	}
	
	@RequestMapping("guardar")
	public String guardar(ConsejeriaEntity consejero) {
		service.guardarConsejero(consejero);
		return "redirect:/formulario";
	}*/
}