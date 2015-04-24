package com.unalm.tutoria;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;

public class App2 {

	public static void main(String[] args) {

		App negocio = new App();
			List<ConsejeriaEntity> listado = negocio.createCars();
			System.out.println(listado.size());
	}
	
}
