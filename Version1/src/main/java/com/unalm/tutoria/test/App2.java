package com.unalm.tutoria.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.dao.CoordConsejeriaDAO;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;
import com.unalm.tutoria.model.Profesor;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");

		//App2.doSave(cntx);
		// App2.doDelete(cntx);

		App2.doUpdate(cntx);
//		App2.doList(cntx);
	}

	public static void doList(ApplicationContext cntx) {

		CoordConsejeriaDAO dao = (CoordConsejeriaDAO) cntx
				.getBean("coordConsejeriaDAO");
		List<CoordConsejeriaEntity> list = dao.list();
		for (CoordConsejeriaEntity programa : list) {
			System.out.println(programa.getCiclo() + " - "
					+ programa.getEspCodigo() + " - " + programa.gettProfe()
					+ " - " + programa.getProfesor().getPro_codigo());
		}
	}

	public static void doSave(ApplicationContext cntx) {
		CoordConsejeriaDAO dao = (CoordConsejeriaDAO) cntx
				.getBean("coordConsejeriaDAO");

		CoordConsejeriaEntity consejero = new CoordConsejeriaEntity();
		Profesor profesor = new Profesor();
		profesor.setPro_codigo("1688");

		consejero.setProfesor(profesor);
		consejero.setEspCodigo("010");
		consejero.settProfe("S");
		consejero.setCiclo("20151");

		System.out.println("SALAMEsEEEEEE");
		dao.save(consejero);

	}

	public static void doDelete(ApplicationContext cntx) {
		CoordConsejeriaDAO dao = (CoordConsejeriaDAO) cntx
				.getBean("coordConsejeriaDAO");
		try {
			System.out.println("ESTA ELIMINANDO");
			dao.delete(1688L);
		} catch (Exception e) {
			System.out.println("no  se encontro");
		}

	}

	public static void doUpdate(ApplicationContext cntx) {

		CoordConsejeriaDAO dao = (CoordConsejeriaDAO) cntx
				.getBean("coordConsejeriaDAO");

		CoordConsejeriaEntity consejero = dao.findByCodigo(1688L);
/*
		Profesor profesor = new Profesor();
		profesor.setPro_codigo("0555");
		*/
	
		System.out.println(
				consejero.getProfesor().getPro_codigo()+" - "
		
			+	consejero.getEspCodigo()+" - "
			+	consejero.gettProfe()+" - "
			+	consejero.getCiclo()
				
				);

		


		//consejero.setProfesor(profesor);
		consejero.setCiclo("20151");
		consejero.setEspCodigo("010");
		consejero.settProfe("P");
		System.out.println("con feeeee");
		dao.update(consejero);

	}

}
