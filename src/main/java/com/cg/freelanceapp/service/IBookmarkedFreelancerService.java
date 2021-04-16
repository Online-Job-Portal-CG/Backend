package com.cg.freelanceapp.service;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer bookmarkFreelancer(Freelancer freelancer, Skill skill, Recruiter recruiter);

	List<BookmarkedFreelancer> findBookmarkedFreelancersBySkill(Skill skill, Recruiter recruiter);

	void removeBookmarkedFreelancer(Freelancer freelancer, Skill skill, Recruiter recruiter);

	BookmarkedFreelancer findById(Long id);

}
