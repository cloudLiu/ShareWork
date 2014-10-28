package com.CZAomai.share.core.repository;

import java.util.List;

import com.CZAomai.share.core.entity.Normaluser;

public interface HNormalUserDao {
	
	List<Normaluser> findAll();
	
	void update(Normaluser user);
}
