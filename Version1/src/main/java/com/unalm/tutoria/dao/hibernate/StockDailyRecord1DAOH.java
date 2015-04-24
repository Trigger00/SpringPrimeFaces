package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.StockDailyRecord1DAO;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.StockDailyRecord1;

@Transactional
@Repository("stockDailyRecord1DAO")
public class StockDailyRecord1DAOH extends BaseHibernateDAO implements
		StockDailyRecord1DAO {

	public List<StockDailyRecord1> list() {
		Criteria criteria = this.getSession().createCriteria(
				StockDailyRecord1.class);

		System.out.println(criteria.list());
		return criteria.list();

	}

	public StockDailyRecord1 get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(StockDailyRecord1 t) {
		// TODO Auto-generated method stub

		this.getSession().save(t);

	}

	public void update(StockDailyRecord1 t) {
		 this.getSession().merge(t);

	}

	public void delete(Long t) {
		this.getSession().delete(new StockDailyRecord1(t));

	}

	public StockDailyRecord1 findByCodigo(Long codigo) {
		Criteria criteria = this.getSession().createCriteria(StockDailyRecord1.class);
		 criteria.add(Restrictions.eq("id", codigo));
		return (StockDailyRecord1) criteria.uniqueResult();
	}

}
