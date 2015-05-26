package com.unalm.tutoria.test;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.unalm.tutoria.controller.consejeroNcst.ConsejeroNcstServiceImp;
import com.unalm.tutoria.model.ConsejeroNcstEntity;

@ManagedBean(name = "itemMB2")
@RequestScoped
public class BasicFind {
	@ManagedProperty(value = "#{consejero1}")
	private ConsejeroNcstServiceImp consejero1;
	List<ConsejeroNcstEntity> cars;
	ConsejeroNcstEntity beanSelected;
	private String msj ;
	//private  String error = "0";

	public BasicFind() {
		beanSelected = new ConsejeroNcstEntity();
		// cars = new ArrayList<ConsejeroNcstEntity>();

	}

	public String find( ) {

		System.out.println("ENTRO FIND");
		System.out.println("EL VALOR DE MATRICULA ES: " +this.beanSelected.getMatricula());
		
		
		String matricula = this.beanSelected.getMatricula();
		Long id1 = Long.valueOf(matricula).longValue();
		
		beanSelected = consejero1.findConsejeroNcst(id1);
		
		System.out.println("EL VALOR DEL BEAN ES:" + beanSelected);
		if (beanSelected == null) {
			
			
			return this.msj;
		}
		this.msj= "1";
		
		return this.msj;

	}

	public ConsejeroNcstServiceImp getConsejero1() {
		return consejero1;
	}

	public void setConsejero1(ConsejeroNcstServiceImp consejero1) {
		this.consejero1 = consejero1;
	}

	public List<ConsejeroNcstEntity> getCars() {
		return cars;
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

	public String getMsj() {
		
		System.out.println( "el valor es "+ msj);
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
	}




	

}
