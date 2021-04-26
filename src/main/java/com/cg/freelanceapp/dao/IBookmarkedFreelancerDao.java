package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Skill;

/**************************************************************************************
 * @author Vishnuvardhan 
 * Description: This is the DAO Interface for BookmarkedFreelancer module. 
 * Created Date: 19 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/
@Repository
public interface IBookmarkedFreelancerDao extends JpaRepository<BookmarkedFreelancer, Long> {

	/*******************************************************************************************
	 * Method:      findBookmarkedFreelancerBySkill
	 * @param       skill
	 * @return      List<BookmarkedFreelancer>
	 * Description: This method returns a list of bookmarked freelancers who have a common skill.
	 *******************************************************************************************/
	@Query("SELECT bf FROM Freelancer f, BookmarkedFreelancer bf"
			+ " WHERE f.id = bf.freelancer.id and bf.skill = :skill")
	List<BookmarkedFreelancer> findBookmarkedFreelancerBySkill(@Param("skill") Skill skill);

	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Query(value = "select bkd_fr_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

}
