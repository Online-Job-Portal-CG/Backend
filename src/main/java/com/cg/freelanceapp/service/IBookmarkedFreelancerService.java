package com.cg.freelanceapp.service;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedFreelancerService {

	BookmarkedFreelancer save(BookmarkedFreelancer bookmarked);

	void remove(BookmarkedFreelancer bookmarked);

	List<BookmarkedFreelancer> findBookmarkedFreelancerBySkill(Skill skill);
}
