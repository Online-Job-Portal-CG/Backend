package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Skill;

@Repository
public interface IBookmarkedJobDao extends JpaRepository<BookmarkedJob,Long>  
{


	
	@Query("SELECT bj FROM Job j, BookmarkedJob bj"
			+ " WHERE j.id = bj.job.id and bj.skill = :skill")
	List<BookmarkedJob> findBookmarkedJobBySkill(@Param("skill") Skill skill);
	
	List<BookmarkedJob> findBookmarkedJobsBySkillId(Long SId);
	
	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Query(value = "select bkd_job_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();
}
