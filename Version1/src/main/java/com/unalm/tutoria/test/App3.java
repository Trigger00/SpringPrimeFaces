package com.unalm.tutoria.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.dao.ConsejeroNcstDAO;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.ConsejeroNcstEntity;
import com.unalm.tutoria.model.Profesor;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		
		//App3.doSave(cntx);
		//App3.doDelete(cntx);
		App3.doUpdate(cntx);
		App3.doList(cntx);
		
	}

	public static void doList(ApplicationContext cntx) {

		ConsejeroNcstDAO dao = (ConsejeroNcstDAO) cntx
				.getBean("consejeroNcstDAO");
		List<ConsejeroNcstEntity> list = dao.list();
		for (ConsejeroNcstEntity programa : list) {
			System.out.println(

			programa.getPregunta() + " - " + programa.getCiclo() + " - "
					+ programa.getFechaIng() + " - " + programa.getHoraIng()
					+ " - " + programa.getMatricula() + " - "
					+ programa.getPregunta() + " - " + programa.getProCodigo()
					+ " - " + programa.getRespuesta());
		}
	}

	public static void doSave(ApplicationContext cntx) {
		ConsejeroNcstDAO dao = (ConsejeroNcstDAO) cntx
				.getBean("consejeroNcstDAO");

		ConsejeroNcstEntity consejero = new ConsejeroNcstEntity();

		consejero.setMatricula("20131415");
		consejero.setProCodigo("0109");
		System.out.println("SALAMEEEEEEE");

		dao.save(consejero);
	}

	public static void doDelete(ApplicationContext cntx) {
		ConsejeroNcstDAO dao = (ConsejeroNcstDAO) cntx.getBean("consejeroNcstDAO");
		try {
			System.out.println("ESTA ELIMINANDO");
			dao.delete(20131415L);
		} catch (Exception e) {
			System.out.println("no  se encontro");
		}

	}
	public static void doUpdate(ApplicationContext cntx) {

		ConsejeroNcstDAO dao = (ConsejeroNcstDAO) cntx.getBean("consejeroNcstDAO");

		ConsejeroNcstEntity consejero = dao.findByCodigo(20131415L);



		consejero.setRespuesta("DALEEEEEEEEEEEEEEEEEEEEEEE");

		System.out.println("con feeeee");
		dao.update(consejero);

	}
	
	
}
