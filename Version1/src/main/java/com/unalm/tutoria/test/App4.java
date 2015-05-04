package com.unalm.tutoria.test;

import com.unalm.tutoria.dao.AlumnosDAO;
import com.unalm.tutoria.dao.ConsejeroDAO;

import com.unalm.tutoria.dao.StockDAO;
import com.unalm.tutoria.dao.StockDailyRecord1DAO;

import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;

import com.unalm.tutoria.model.Stock;

import com.unalm.tutoria.model.StockDailyRecord1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		// App4.doSave2(cntx);
		// App4.doDelete(cntx);
		App4.doList4(cntx);
		// App4.doUpdate(cntx);
	}

	public static void doList4(ApplicationContext cntx) {

		StockDailyRecord1DAO dao = (StockDailyRecord1DAO) cntx
				.getBean("stockDailyRecord1DAO");
		List<StockDailyRecord1> list = dao.list();
		for (StockDailyRecord1 programa : list) {
			System.out.println(programa.getId() + " - "
					+ programa.getPriceChange() + " - "
					+ programa.getPriceClose() + " - "
					+ programa.getPriceOpen() + " - " + programa.getVolume()
					+ " - " + programa.getStock().getStockId());
		}
	}

	public static void doSave2(ApplicationContext cntx) {
		StockDailyRecord1DAO dao = (StockDailyRecord1DAO) cntx
				.getBean("stockDailyRecord1DAO");
		StockDailyRecord1 stockDailyRecord = new StockDailyRecord1();
		Stock stock = new Stock();
		stock.setStockId(1);

		// stockDailyRecord.setRecordId(4004);
		stockDailyRecord.setPriceChange(505);
		stockDailyRecord.setPriceClose(505);
		stockDailyRecord.setPriceOpen(505);
		stockDailyRecord.setVolume(505);
		// stockDailyRecord.setStockId(1);
		stockDailyRecord.setStock(stock);
		;

		System.out.println("SALAMEEEEEEE");
		dao.save(stockDailyRecord);
	}

	public static void doDelete(ApplicationContext cntx) {
		StockDailyRecord1DAO dao = (StockDailyRecord1DAO) cntx
				.getBean("stockDailyRecord1DAO");
		try {
			dao.delete(11L);
		} catch (Exception e) {

			System.out.println("No hallo el id");
		}

	}

	public static void doUpdate(ApplicationContext cntx) {
		StockDailyRecord1DAO dao = (StockDailyRecord1DAO) cntx
				.getBean("stockDailyRecord1DAO");

		StockDailyRecord1 stockDailyRecord = dao.findByCodigo(11800L);
		Stock stock = new Stock();
		stock.setStockId(2);
		stockDailyRecord.setPriceChange(69);
		stockDailyRecord.setPriceClose(69);
		stockDailyRecord.setPriceOpen(69);
		stockDailyRecord.setVolume(69);
		stockDailyRecord.setStock(stock);
		;
		dao.update(stockDailyRecord);
	}

}