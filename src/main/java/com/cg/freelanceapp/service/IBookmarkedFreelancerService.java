package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedFreelancerException;


@Service
public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto);

	List<BookmarkedFreelancer> findBookmarkedFreelancersBySkillName(String skillname);

	BookmarkedFreelancer findById(Long id) throws InvalidBookmarkedFreelancerException;
	
	void deleteBookmarkedFreelancerById(Long id);

}
