package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Admin;

@Repository
public interface IAdminDao extends JpaRepository<Admin, Long> {
	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Query(value = "select admin_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

	public Admin findByUserName(String userName);

	public boolean existsByUserName(String userName);
}
