package com.CZAomai.share.core.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.CZAomai.share.core.entity.Normaluser;
import com.CZAomai.share.core.repository.NormalUserDao;

@Component
@Transactional
public class NormalUserService {
	
	private NormalUserDao normalUserDao;
	
	public List<Normaluser> findAll()
	{
		return (List<Normaluser>) normalUserDao.findAll();
	}
	
	public Normaluser findByUserName(String name)
	{
		return normalUserDao.findByUserName(name);
	}
}
