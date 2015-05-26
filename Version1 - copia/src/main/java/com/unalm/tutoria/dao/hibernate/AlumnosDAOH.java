package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.AlumnosDAO;
import com.unalm.tutoria.model.AlumnosEntity;

//@Transactional
@Repository("alumnosDAO")
public class AlumnosDAOH  extends BaseHibernateDAO implements AlumnosDAO{

	public List<AlumnosEntity> list() {
		Criteria criteria = this.getSession().createCriteria(AlumnosEntity.class);
		return criteria.list();
	}

	public AlumnosEntity get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(AlumnosEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void update(AlumnosEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public AlumnosEntity findByCodigo(String Codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
