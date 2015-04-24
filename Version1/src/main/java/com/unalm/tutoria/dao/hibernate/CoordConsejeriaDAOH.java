package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.unalm.tutoria.dao.CoordConsejeriaDAO;
import com.unalm.tutoria.model.CoordConsejeriaEntity;
@Repository("coordConsejeriaDAO")
public class CoordConsejeriaDAOH  extends BaseHibernateDAO implements CoordConsejeriaDAO{

	public List<CoordConsejeriaEntity> list() {
		Criteria criteria = this.getSession().createCriteria(CoordConsejeriaEntity.class);
		return criteria.list();
	}

	public CoordConsejeriaEntity get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(CoordConsejeriaEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void update(CoordConsejeriaEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public CoordConsejeriaEntity findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
