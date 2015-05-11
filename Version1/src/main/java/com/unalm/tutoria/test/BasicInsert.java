package com.unalm.tutoria.test;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.unalm.tutoria.controller.consejero.ConsejeroService;
import com.unalm.tutoria.controller.consejero.ConsejeroServiceImp;
import com.unalm.tutoria.controller.consejeroNcst.ConsejeroNcstServiceImp;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.ConsejeroNcstEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;

@ManagedBean(name = "itemMB")
@ViewScoped
public class BasicInsert implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{consejero1}")
	private ConsejeroNcstServiceImp consejero1;
	private String matricula;
	private ConsejeroNcstEntity conseje;

	public void save() {
		System.out.println("ENTRO AL itemMB");
		ConsejeroNcstEntity consejeria = new ConsejeroNcstEntity();
		consejeria.setMatricula(getMatricula());
		System.out.println("EL VALOR DE MATRICULA ES: "
				+ consejeria.getMatricula());
		consejero1.guardarConsejero(this.conseje);
	}

	public BasicInsert() {
		conseje =new ConsejeroNcstEntity();
	}

	
	
	public ConsejeroNcstServiceImp getConsejero1() {
		return consejero1;
	}

	public void setConsejero1(ConsejeroNcstServiceImp consejero1) {
		this.consejero1 = consejero1;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ConsejeroNcstEntity getConseje() {
		return conseje;
	}

	public void setConseje(ConsejeroNcstEntity conseje) {
		this.conseje = conseje;
	}
	
	
	

}