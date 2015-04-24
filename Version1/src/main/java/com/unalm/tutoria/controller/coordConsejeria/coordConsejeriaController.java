package com.unalm.tutoria.controller.coordConsejeria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unalm.tutoria.model.CoordConsejeriaEntity;


@Controller
@RequestMapping("coordinador")
public class coordConsejeriaController {

	@Autowired
	coordConsejeriaService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model){
		
		List<CoordConsejeriaEntity> coordinadores = service.allCoordinador();
		model.addAttribute("coordinadores", coordinadores);
		
		return "coordinador/index";
		
	}
}
