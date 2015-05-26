package com.unalm.tutoria.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Size;

import com.unalm.tutoria.controller.consejeroNcst.ConsejeroNcstServiceImp;
import com.unalm.tutoria.model.ConsejeroNcstEntity;

@ManagedBean(name="checkboxView")
@ViewScoped
public class CheckboxView implements Serializable {
	private static final long serialVersionUID = 1L;
	private String[] selectedConsoles;
	private String[] selectedConsoles2;
	private String[] selectedCities;
	private String[] selectedCities2;
	private List<String> cities;
	
	
	
	@ManagedProperty(value = "#{consejero1}")
	private ConsejeroNcstServiceImp consejero1;
	private ConsejeroNcstEntity conseje;
	private String input1Value;

	private String input2Value;

	@PostConstruct
	public void init() {
		cities = new ArrayList<String>();
		cities.add("San Francisco");
		cities.add("London");
		cities.add("Paris");
		cities.add("Istanbul");
		cities.add("Berlin");
		cities.add("Barcelona");
		cities.add("Rome");
		cities.add("Sao Paulo");
		cities.add("Amsterdam");
	}



	public String getInput1Value() {
		return input1Value;
	}

	public void setInput1Value(String input1Value) {
		this.input1Value = input1Value;
	}

	public void save() {
		System.out.println("ENTRO A SAVE");

		if (this.getInput1Value() == "false" && this.selectedCities.length == 0) {

			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",
							"Contact admin."));
		} else if (this.getInput1Value() == "true"
				&& this.input2Value.length() == 0) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"DEBE DE INGRESAR INGRESAR EN OTROS ",
							"Contact admin."));
		} else if (this.getInput1Value() == "true"
				&& this.input2Value.length() >10) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"NO DEBE SER MAYOR A 10", "Contact admin."));
		} else {
		
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Welcome "));
		
		
			/*
			
			System.out.println("ENTRO AL PARA INSERTAR");
			System.out.println(" LA BARIABLE ES : "+ selectedCities[0]);
			ConsejeroNcstEntity consejeria = new ConsejeroNcstEntity();
			consejeria.setMatricula(getInput2Value());
			consejeria.setPregunta(selectedCities[0]);
			System.out.println(" LA BARIABLE ES : "+ consejeria.getMatricula());
			*/
			//consejero1.guardarConsejero(consejeria);
			
			ConsejeroNcstEntity arrayObjetos[]=new ConsejeroNcstEntity[10];
			
			//arrayObjetos[0]=new ConsejeroNcstEntity(getInput2Value());
			
			//consejero1.guardarConsejero2(arrayObjetos);
			for(int i=0;i<10;i++){
				
				 arrayObjetos[i]=new ConsejeroNcstEntity(getInput2Value(),selectedCities[0],"asd","asd","asd","asd","asd");
			}
			  
			consejero1.guardarConsejero2(arrayObjetos);
		}
	}

	
	
	public CheckboxView() {
		conseje = new ConsejeroNcstEntity();
	}
	public String getInput2Value() {



		return input2Value;
	}

	public void setInput2Value(String input2Value) {


		this.input2Value = input2Value;
	}

	public String[] getSelectedConsoles() {
		return selectedConsoles;
	}

	public void setSelectedConsoles(String[] selectedConsoles) {
		this.selectedConsoles = selectedConsoles;
	}

	public String[] getSelectedConsoles2() {
		return selectedConsoles2;
	}

	public void setSelectedConsoles2(String[] selectedConsoles2) {
		this.selectedConsoles2 = selectedConsoles2;
	}

	public String[] getSelectedCities() {

		return selectedCities;
	}

	public void setSelectedCities(String[] selectedCities) {
		this.selectedCities = selectedCities;

	}

	public String[] getSelectedCities2() {
		return selectedCities2;
	}

	public void setSelectedCities2(String[] selectedCities2) {
		this.selectedCities2 = selectedCities2;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public ConsejeroNcstServiceImp getConsejero1() {
		return consejero1;
	}

	public void setConsejero1(ConsejeroNcstServiceImp consejero1) {
		this.consejero1 = consejero1;
	}

	public ConsejeroNcstEntity getConseje() {
		return conseje;
	}

	public void setConseje(ConsejeroNcstEntity conseje) {
		this.conseje = conseje;
	}
	
	
	
	
	
	

}