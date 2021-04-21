package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;


@Service
public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto);

	List<BookmarkedFreelancer> findBookmarkedFreelancersBySkillId(Long id);

	void removeBookmarkedFreelancer(BookmarkedFreelancer bookmarkedFreelancer);

	BookmarkedFreelancer findById(Long id);

}
