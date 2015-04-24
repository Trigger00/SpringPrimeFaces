package com.unalm.tutoria.controller.alumnos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.model.AlumnosEntity;


@Controller
@RequestMapping("alumnos")
public class AlumnosController  {

	@Autowired
	AlumnosService service;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model){
		List<AlumnosEntity> alumnos = service.allAlumnos();
		model.addAttribute("alumnos",alumnos);
		return "alumnos/index";
	}

}
