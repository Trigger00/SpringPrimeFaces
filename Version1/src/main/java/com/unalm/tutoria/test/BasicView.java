package com.unalm.tutoria.test;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;



import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;

 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private List<ConsejeriaEntity> cars;
         private App service;
 

    public void init() {
        cars = service.createCars();
        System.out.println("mira esa nota papa"+cars);
    }
     
    public List<ConsejeriaEntity> getCars() {
    	

		App negocio = new App();
			List<ConsejeriaEntity> listado = negocio.createCars();
			System.out.println(listado.size());
    	
    	 cars = listado;
        System.out.println("mira esa nota papa 2"+cars);
    	return cars;
        
    }
 
    public void setService(App service) {
        this.service = service;
    }
}