package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.CoordConsejeriaDAO;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.CoordConsejeriaEntity;
import com.unalm.tutoria.model.Profesor;

@Repository("coordConsejeriaDAO")
public class CoordConsejeriaDAOH extends BaseHibernateDAO implements
		CoordConsejeriaDAO {

	public List<CoordConsejeriaEntity> list() {
		Criteria criteria = this.getSession().createCriteria(
				CoordConsejeriaEntity.class);
		return criteria.list();
	}

	public CoordConsejeriaEntity get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void save(CoordConsejeriaEntity t) {
		this.getSession().save(t);
	}

	@Transactional
	public void update(CoordConsejeriaEntity t) {
		this.getSession().merge(t);

	}
	@Transactional
	public void delete(Long t) {
		Profesor profesor = new Profesor();
		profesor.setPro_codigo(String.valueOf(t));
		this.getSession().delete(new CoordConsejeriaEntity(profesor));

	}

	public CoordConsejeriaEntity findByCodigo(Long codigo) {
		Criteria criteria = this.getSession().createCriteria(
				CoordConsejeriaEntity.class);
		criteria.add(Restrictions.eq("profesor.pro_codigo",
				String.valueOf(codigo)));
		return (CoordConsejeriaEntity) criteria.uniqueResult();
	}

}