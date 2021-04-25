package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedFreelancerException;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Interface for BookmarkedFreelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto);

	void deleteBookmarkedFreelancerById(Long id);

	List<BookmarkedFreelancer> findBookmarkedFreelancersBySkillName(String skillname);

	BookmarkedFreelancer findById(Long id) throws InvalidBookmarkedFreelancerException;

}
