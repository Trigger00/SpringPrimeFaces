package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




import com.unalm.tutoria.dao.StockDailyRecordDAO;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.StockDailyRecord;
@Transactional
@Repository("stockDailyRecordDAO")
public class StockDailyRecordDAOH extends BaseHibernateDAO implements
		StockDailyRecordDAO {

	public List<StockDailyRecord> list() {

		/*
		 * Criteria criteria =
		 * this.getSession().createCriteria(StockDailyRecord.class); return
		 * criteria.list();
		 */

	
		 
		Criteria criteria = this.getSession().createCriteria(StockDailyRecord.class)	
		.createAlias("stock", "mt", Criteria.LEFT_JOIN);
		//.add( Restrictions.eq("mt.stockId", 2) );	
		//criteria.add(Restrictions.eq("priceOpen", 101));
		//criteria.add(Restrictions.eq("mt.stockCode", "0001"));
		System.out.println(criteria.list());
		return criteria.list();
		
		/*
		 * seleect *
		 * from  stock_daily_record 
		 * left join stock mt on stock_daily_record.stock_id = mt.stock_id
		 * and price_open='101'
		 * where mt.stockCode = '0001'
		 * */

	}

	public StockDailyRecord get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(StockDailyRecord t) {
		// TODO Auto-generated method stub
		
		  this.getSession().save(t);

	}

	public void update(StockDailyRecord t) {
		// TODO Auto-generated method stub

	}

	public void delete(Long t) {
		   this.getSession().delete(new StockDailyRecord(t));

	}


	public StockDailyRecord findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}


}
