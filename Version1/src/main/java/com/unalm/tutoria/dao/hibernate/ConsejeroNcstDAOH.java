package com.unalm.tutoria.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.ScrollableResults;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unalm.tutoria.dao.ConsejeroDAO;
import com.unalm.tutoria.dao.ConsejeroNcstDAO;
import com.unalm.tutoria.model.AlumnosEntity;
import com.unalm.tutoria.model.ConsejeriaEntity;
import com.unalm.tutoria.model.ConsejeroNcstEntity;

@Repository("consejeroNcstDAO")
public class ConsejeroNcstDAOH extends BaseHibernateDAO implements
		ConsejeroNcstDAO {

	public List<ConsejeroNcstEntity> list() {
		Criteria criteria = this.getSession().createCriteria(
				ConsejeroNcstEntity.class);
		return criteria.list();

	}

	public ConsejeroNcstEntity get(Long t) {
		Criteria criteria = this.getSession().createCriteria(
				ConsejeroNcstEntity.class);
		criteria.add(Restrictions.eq("matricula", t));

		return (ConsejeroNcstEntity) criteria.uniqueResult();
	}

	@Transactional
	public void save(ConsejeroNcstEntity t) {
		
		 ConsejeroNcstEntity arrayObjetos[]=new ConsejeroNcstEntity[2];
		 arrayObjetos[0]=new ConsejeroNcstEntity("20090009");
		 arrayObjetos[1]=new ConsejeroNcstEntity("20090008");

		//this.getSession().save(t);
		 this.getSession().save(arrayObjetos[0]);
		 this.getSession().save(arrayObjetos[1]);


	}

	
	
	
	

	
	
	@Transactional
	public void update(ConsejeroNcstEntity t) {
		this.getSession().merge(t);

	}

	@Transactional
	public void delete(Long t) {

		String matricula = String.valueOf(t);
		this.getSession().delete(new ConsejeroNcstEntity(matricula));

	}

	public ConsejeroNcstEntity findByCodigo(Long Codigo) {
		Criteria criteria = this.getSession().createCriteria(
				ConsejeroNcstEntity.class);
		criteria.add(Restrictions.eq("matricula", String.valueOf(Codigo)));
		return (ConsejeroNcstEntity) criteria.uniqueResult();
	}

	@Transactional
	public void save2(ConsejeroNcstEntity[] arrayObjetos) {		
			//arrayObjetos=new ConsejeroNcstEntity[2];
			 //arrayObjetos[0]=new ConsejeroNcstEntity("20090009");
			 //arrayObjetos[1]=new ConsejeroNcstEntity("20090008");


			 this.getSession().save(arrayObjetos[0]);
			// this.getSession().save(arrayObjetos[1]);
			
	}

}
