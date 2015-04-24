package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.model.ConsejeriaEntity;

@Repository("consejeroDAO")
public class ConsejeroDAOH extends BaseHibernateDAO implements ConsejeroDAO{

	public List<ConsejeriaEntity> list() {
		 /*
		   
		    Criteria criteria = this.getSession().createCriteria(ConsejeroEntity.class);
	        return criteria.list();
	        
	        */
	    Criteria criteria = this.getSession().createCriteria(ConsejeriaEntity.class)
	    		.createAlias("profesor", "p",Criteria.LEFT_JOIN)
	    .createAlias("alumnos", "a",Criteria.LEFT_JOIN);
	    criteria.add(Restrictions.eq("p.pro_codigo", "0109"));
	    criteria.add(Restrictions.eq("alumnos.matricula", "19990045"));
	    return criteria.list();
		
	}

	public ConsejeriaEntity get(Long t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(ConsejeriaEntity t) {
	       this.getSession().save(t);
		
	}

	public void update(ConsejeriaEntity t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public ConsejeriaEntity findByCodigo(String Codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}