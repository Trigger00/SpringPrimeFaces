package com.unalm.tutoria.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.unalm.tutoria.controller.consejero.ConsejeroServiceImp;
import com.unalm.tutoria.controller.consejeroNcst.ConsejeroNcstServiceImp;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.ConsejeroNcstEntity;


@ManagedBean(name = "itemMB1")
@RequestScoped
public class BasicDelete implements Serializable {

	@ManagedProperty(value = "#{consejero1}")
	private ConsejeroNcstServiceImp consejero1;
	List<ConsejeroNcstEntity> cars;
	ConsejeroNcstEntity beanSelected;
	
	public BasicDelete() {
		beanSelected =new ConsejeroNcstEntity();
		//cars = new ArrayList<ConsejeroNcstEntity>();
		
	}

	
	
	public void delete() {
		System.out.println("ENTRO AL METODO DELETE");
		
System.out.println("EL VALOR ES:"+ " - "+ this.beanSelected.getMatricula());
		String matricula = this.beanSelected.getMatricula();
		Long id =Long.valueOf(matricula).longValue();
		consejero1.deleteConsejeroNcst(id);
			
	}

	public List<ConsejeroNcstEntity> getCars() {

		// App negocio = new App();
		// List<ConsejeriaEntity> listado = negocio.createCars();
		List<ConsejeroNcstEntity> listado = consejero1.allConsejeroNcst();
		//System.out.println(listado.size());

		cars = listado;
		/*System.out.println("QUIE LLORAR CARAJOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"
				+ cars);
		*/ return cars;

	}

	public ConsejeroNcstServiceImp getConsejero1() {
		return consejero1;
	}

	public void setConsejero1(ConsejeroNcstServiceImp consejero1) {
		this.consejero1 = consejero1;
	}

	public void setCars(List<ConsejeroNcstEntity> cars) {
		this.cars = cars;
	}

	public ConsejeroNcstEntity getBeanSelected() {
		return beanSelected;
	}

	public void setBeanSelected(ConsejeroNcstEntity beanSelected) {
		this.beanSelected = beanSelected;
	}



}
