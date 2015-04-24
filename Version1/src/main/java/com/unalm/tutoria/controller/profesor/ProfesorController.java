package com.unalm.tutoria.controller.profesor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.model.Profesor;

@Controller
@RequestMapping("profesor")
public class ProfesorController {

	
	@Autowired
	ProfesorService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		List<Profesor> profesores = service.allProfesor();
		model.addAttribute("profesores", profesores);
		return "profesor/index";
	}


}
