package com.unalm.tutoria;


import com.unalm.tutoria.dao.ProgramaDAO;
import com.unalm.tutoria.model.Programa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		// App.doSave(cntx);
		// App.doDelete(cntx);
		// App.doDelete(cntx);
		//App.doDelete(cntx);
		
		App3.doSave(cntx);
		App3.doList(cntx);
	}

	public List<Programa> createCars() {

		ApplicationContext cntx1 = new ClassPathXmlApplicationContext("app.xml");
		ProgramaDAO dao = (ProgramaDAO) cntx1.getBean("programaDAO");
		List<Programa> list = dao.list();

		/*
		 * List<Car> list = new ArrayList<Car>(); for(int i = 0 ; i < size ;
		 * i++) { list.add(new Car(getRandomId(), getRandomBrand(),
		 * getRandomYear(), getRandomColor(), getRandomPrice(),
		 * getRandomSoldState())); }
		 */
		for (Programa programa : list) {
			System.out.println(programa.getNombre());
		}

		return list;
	}

	public static void doList(ApplicationContext cntx) {

		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");
		List<Programa> list = dao.list();
		for (Programa programa : list) {
			System.out.println(programa.getNombre() + " - "
					+ programa.getCodigo() );
		}
	}

	public static void doSave(ApplicationContext cntx) {
		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");

		Programa programa = new Programa();
		programa.setCodigo("666");
		programa.setDescripcion("666");
		programa.setNombre("666");
		//programa.setId(11L);

		dao.save(programa);
	}

	

}
