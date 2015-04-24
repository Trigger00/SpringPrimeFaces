package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.StockDAO;
import com.unalm.tutoria.model.Stock;
@Transactional
@Repository("stockDAO")
public class StockDAOH extends BaseHibernateDAO implements StockDAO {

	public List<Stock> list() {
		/*
		 * Criteria criteria =
		 * this.getSession().createCriteria(Stock.class,"stock")
		 * .createAlias("stock.stock_detail","stockdailyrecord")
		 * .add(Restrictions.eq("stock.stockId", 1));
		 */

		
		  Criteria criteria =
		  this.getSession().createCriteria(Stock.class,"stock");
		
		/*
		Criteria criteria = this.getSession()
				.createCriteria(Stock.class, "stock")
				.createAlias("stock.stockDetail", "stockdailyrecord")
				// .add(Restrictions.eq("stockdailyrecord.stockId", 2));
				.add(Restrictions.eq("stock.stockId", 2))
				.add(Restrictions.eq("stockdailyrecord.remark", "200"));
*/
		/*
		 * Criteria criteria = session.createCriteria(Club.class,"club")
		 * .createAlias("club.team","team") .add(Restrictions.eq("club.name",
		 * "Arsenal")) .add(Restrictions.eq("team.teamname", "Team A")); List
		 * list = criteria.list();
		 */

		/*
		 * Criteria criteria = this.getSession().createCriteria(Stock.class);
		 * criteria.setFetchMode("stock_detail", FetchMode.JOIN);
		 */

		/*
		 * Criteria criteria = this.getSession().createCriteria(Stock.class)
		 * .add(Restrictions.eq("stockId", 1));
		 */

		return criteria.list();
	}

	public Stock get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Stock t) {
	this.getSession().save(t);

	}

	public void update(Stock t) {
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
