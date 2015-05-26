package com.unalm.tutoria.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.dao.StockDailyRecord1DAO;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.Profesor;
import com.unalm.tutoria.model.StockDailyRecord1;

public class App {
	
	
	public List<ConsejeriaEntity> createCars() {

		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");
		List<ConsejeriaEntity> list = dao.list();

		for (ConsejeriaEntity programa : list) {
			System.out.println(programa.getCiclo());
		}

		return list;
	}
	
	
	

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");

		//App.doSave(cntx);
		// App.doDelete(cntx);
		// App.doUpdate(cntx);
		App.doList(cntx);
	}

	public static void doList(ApplicationContext cntx) {

		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");
		List<ConsejeriaEntity> list = dao.list();
		for (ConsejeriaEntity programa : list) {
			System.out.println(programa.getCiclo() + " - "
					+ programa.getProfesor().getPro_codigo() + " - "
					+ programa.getAlumnos().getMatricula() + " - "
					+ programa.getCoConsejeria());
		}
	}

	public static void doSave(ApplicationContext cntx) {
		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");

		ConsejeriaEntity consejero = new ConsejeriaEntity();
		AlumnosEntity alumnos = new AlumnosEntity();
		alumnos.setMatricula("20131415");
		Profesor profesor = new Profesor();
		profesor.setPro_codigo("0109");

		// consejero.setMatricula("20131415");
		consejero.setAlumnos(alumnos);
		consejero.setCiclo("25555");
		consejero.setProfesor(profesor);
		// consejero.setId(111);
		System.out.println("SALAMEEEEEEE");
		dao.save(consejero);

	}

	public static void doDelete(ApplicationContext cntx) {
		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");
		try {
			System.out.println("ESTA ELIMINANDO");
			dao.delete(20131415L);
		} catch (Exception e) {
			System.out.println("no  se encontro");
		}

	}

	public static void doUpdate(ApplicationContext cntx) {

		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");

		ConsejeriaEntity consejero = dao.findByCodigo(20070194L);

		Profesor profesor = new Profesor();
		profesor.setPro_codigo("0555");

		consejero.setCiclo("7777");
		consejero.setProfesor(profesor);

		System.out.println("con feeeee");
		dao.update(consejero);

	}

}