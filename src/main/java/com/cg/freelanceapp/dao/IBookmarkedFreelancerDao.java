package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO;
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
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Query(value = "select bkd_fr_seq.currval from dual", nativeQuery = true)
	Long getCurrentSeriesId();

	@Query(value="select new com.cg.freelanceapp.dto.BookmarkedFreelancerListDTO(bf.id, CONCAT(bf.freelancer.firstName, ' ', bf.freelancer.lastName) as freelancerName, bf.freelancer.userName, CONCAT(bf.bookmarkedBy.firstName, ' ', bf.bookmarkedBy.lastName) as recruiterName, bf.bookmarkedBy.userName) from BookmarkedFreelancer bf order by bf.id")
	List<BookmarkedFreelancerListDTO> findAllDTO(); 
}
