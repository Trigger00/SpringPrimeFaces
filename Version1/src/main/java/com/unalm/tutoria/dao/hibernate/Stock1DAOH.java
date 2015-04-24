package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.Stock1DAO;
import com.unalm.tutoria.dao.StockDAO;
import com.unalm.tutoria.model.Stock;
import com.unalm.tutoria.model.Stock1;
@Transactional
@Repository("stock1DAO")
public class Stock1DAOH extends BaseHibernateDAO implements Stock1DAO {

	public List<Stock1> list() {
		  Criteria criteria =
				  this.getSession().createCriteria(Stock1.class,"stock1");
		  return criteria.list();
	}

	public Stock1 get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Stock1 t) {
        this.getSession().save(t);
		
	}

	public void update(Stock1 t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public Stock findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}


}
