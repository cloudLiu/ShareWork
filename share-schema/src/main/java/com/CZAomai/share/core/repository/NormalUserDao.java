package com.CZAomai.share.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;




import com.CZAomai.share.core.entity.Normaluser;


public interface NormalUserDao extends PagingAndSortingRepository<Normaluser, Long>{
	
//	Normaluser findById(long id);
//	void delete(Normaluser user);
//	void update(Normaluser user);
	
//	Page<Normaluser> findByUserId(Long id, Pageable pageRequest);
//
//	@Modifying
//	@Query("delete from am_normaluser task where task.user.id=?1")
//	void deleteByUserId(Long id);
	
	Normaluser findByUserName(String userName);
}
