package com.unalm.tutoria;

import com.unalm.tutoria.dao.AlumnosDAO;
import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.dao.CoordConsejeriaDAO;
import com.unalm.tutoria.dao.Stock1DAO;
import com.unalm.tutoria.dao.StockDAO;
import com.unalm.tutoria.dao.StockDailyRecordDAO;
import com.unalm.tutoria.dao.hibernate.StockDailyRecordDAOH;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;
import com.unalm.tutoria.model.Profesor;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.Stock1;
import com.unalm.tutoria.model.StockDailyRecord;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		 //App.doSave2(cntx);
		// App.doList4(cntx);
		App.doDelete(cntx);

	}

	public static void doList(ApplicationContext cntx) {

		AlumnosDAO dao = (AlumnosDAO) cntx.getBean("alumnosDAO");
		List<AlumnosEntity> list = dao.list();
		for (AlumnosEntity programa : list) {
			System.out.println(programa.getAlu_nombre());
		}
	}

	public static void doList2(ApplicationContext cntx) {

		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");
		List<ConsejeriaEntity> list = dao.list();
		for (ConsejeriaEntity programa : list) {
			System.out.println(programa.getAlumnos().getPro_codigo());
		}
	}


	public static void doSave(ApplicationContext cntx) {
		ConsejeroDAO dao = (ConsejeroDAO) cntx.getBean("consejeroDAO");
		ConsejeriaEntity programa = new ConsejeriaEntity();
		programa.setCiclo("20151");
		dao.save(programa);
	}



	public static void doDelete(ApplicationContext cntx) {
		StockDailyRecordDAO dao = (StockDailyRecordDAO) cntx.getBean("stockDailyRecordDAO");
		try {
			dao.delete(9700L);
		} catch (Exception e) {

			System.out.println("No hallo el id");
		}

	}

}