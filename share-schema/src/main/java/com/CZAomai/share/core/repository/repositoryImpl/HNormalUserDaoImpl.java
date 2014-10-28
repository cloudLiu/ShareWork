package com.CZAomai.share.core.repository.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.CZAomai.share.core.entity.Normaluser;
import com.CZAomai.share.core.repository.HNormalUserDao;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class HNormalUserDaoImpl  implements HNormalUserDao{
 	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public List<Normaluser> findAll() {
		// TODO Auto-generated method stub
		return (List<Normaluser>)hibernateTemplate.find("from Normaluser");
	}

	public void update(Normaluser user) {
		// TODO Auto-generated method stub
		
	}

}
