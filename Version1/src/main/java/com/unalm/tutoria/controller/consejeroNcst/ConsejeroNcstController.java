package com.unalm.tutoria.controller.consejeroNcst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unalm.tutoria.model.ConsejeroNcstEntity;

@Controller
@RequestMapping("consejero1")
public class ConsejeroNcstController {
	
@Autowired
ConsejeroNcstService service;


@RequestMapping("nuevo")
public String nuevo(Model model) {
	model.addAttribute("consejero1", new ConsejeroNcstEntity());
	return "consejero1/index";
}

@RequestMapping("guardar")
public String guardar(ConsejeroNcstEntity consejero) {
	System.out.println("LOS DATOS INSERTADOS SON"+ consejero.getMatricula());
	service.guardarConsejero(consejero);
	//return "redirect:/consejero1";
	return "consejero1/index";
}
}
