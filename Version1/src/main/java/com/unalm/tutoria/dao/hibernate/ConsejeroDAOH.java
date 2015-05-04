package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.StockDailyRecord1;


@Repository("consejeroDAO")
public class ConsejeroDAOH extends BaseHibernateDAO implements ConsejeroDAO {
	
	public List<ConsejeriaEntity> list() {

		Criteria criteria = this.getSession().createCriteria(
				ConsejeriaEntity.class);
		return criteria.list();

		/*
		  Criteria criteria =
		  this.getSession().createCriteria(ConsejeriaEntity.class)
		  .createAlias("profesor", "p",Criteria.LEFT_JOIN)
		  .createAlias("alumnos", "a",Criteria.LEFT_JOIN);
		  criteria.add(Restrictions.eq("p.pro_codigo", "0109"));
		 criteria.add(Restrictions.eq("alumnos.matricula", "20131415"));
		  return criteria.list();
		*/
	}

	public ConsejeriaEntity get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void save(ConsejeriaEntity t) {
		this.getSession().save(t);

	}
	@Transactional
	public void update(ConsejeriaEntity t) {
		this.getSession().merge(t);

	}

	@Transactional
	public void delete(Long t) {
		AlumnosEntity alumnos = new AlumnosEntity();
		alumnos.setMatricula(String.valueOf(t));
		this.getSession().delete(new ConsejeriaEntity(alumnos));
	}

	public ConsejeriaEntity findByCodigo(Long Codigo) {
	

		Criteria criteria = this.getSession().createCriteria(
				ConsejeriaEntity.class);
		criteria.add(Restrictions.eq("alumnos.matricula", String.valueOf(Codigo)));
		return (ConsejeriaEntity) criteria.uniqueResult();
	}

}