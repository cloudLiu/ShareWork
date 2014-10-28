package com.CZAomai.share.core.repository.repositoryImpl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.CZAomai.share.core.entity.Normaluser;

@Transactional(propagation=Propagation.REQUIRED)

public class NormalUserDaoImpl {

//	extends HibernateDaoSupport
	
	public Normaluser findById(long id) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public void delete(Normaluser user) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(Normaluser user) {
		// TODO Auto-generated method stub
		
	}

}
