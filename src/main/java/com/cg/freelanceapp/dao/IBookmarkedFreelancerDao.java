package com.cg.freelanceapp.dao;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedFreelancerDao {

	BookmarkedFreelancer save(BookmarkedFreelancer bookmarked);

	void remove(BookmarkedFreelancer bookmarked);

	List<BookmarkedFreelancer> findBookmarkedFreelancerBySkill(Skill skill);
}
