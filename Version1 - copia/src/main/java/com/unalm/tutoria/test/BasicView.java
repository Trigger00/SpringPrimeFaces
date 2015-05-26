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
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;

/*
 @Component(value = "dtBasicView")
 @ViewScoped
 */

@ManagedBean(name = "dtBasicView")
@RequestScoped
public class BasicView implements Serializable {

	// @Autowired
	// private ConsejeroService negocio;

	@ManagedProperty(value = "#{ConsejeroService}")
	private ConsejeroServiceImp consejeroService;
	List<ConsejeriaEntity> cars;

	public List<ConsejeriaEntity> getCars() {

		// App negocio = new App();
		// List<ConsejeriaEntity> listado = negocio.createCars();
		List<ConsejeriaEntity> listado = consejeroService.allConsejero();
		System.out.println(listado.size());

		cars = listado;
		System.out.println("QUIE LLORAR CARAJOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ cars);
		return cars;

	}

	public void setCars(List<ConsejeriaEntity> cars) {
		this.cars = cars;
	}

	public ConsejeroServiceImp getConsejeroService() {
		return consejeroService;
	}

	public void setConsejeroService(ConsejeroServiceImp consejeroService) {
		this.consejeroService = consejeroService;
	}

}