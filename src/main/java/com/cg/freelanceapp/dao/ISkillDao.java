package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Skill;

/**************************************************************************************
 * @author Vishnuvardhan 
 * Description: This is the DAO Interface for Skill module. 
 * Created Date: 19 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/
@Repository
public interface ISkillDao extends JpaRepository<Skill, Long> {

	/******************************************************************************
	 * Method      : existsByName
	 * @param        name
	 * @return       boolean
	 * Description : This method checks if a skill exists by the given unique name.
	 *****************************************************************************/
	boolean existsByName(String name);

	/******************************************************************************
	 * Method      : findByName
	 * @param        name
	 * @return       String
	 * Description : This method returns a skill by the given unique name.
	 *****************************************************************************/
	Skill findByName(String name);
	
	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Query(value = "select skill_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

}
