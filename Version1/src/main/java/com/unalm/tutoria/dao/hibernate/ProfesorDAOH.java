package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;


import org.springframework.stereotype.Repository;

import com.unalm.tutoria.dao.ProfesorDAO;
import com.unalm.tutoria.model.Profesor;


@Repository
public class ProfesorDAOH extends BaseHibernateDAO implements ProfesorDAO {

	public List<Profesor> list() {
		  Criteria criteria = this.getSession().createCriteria(Profesor.class);
	        return criteria.list();
	}

	public Profesor get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Profesor t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Profesor t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public Profesor findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
