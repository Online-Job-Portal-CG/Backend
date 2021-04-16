package com.cg.freelanceapp.service;

import java.util.List;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;

public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(Job job, Freelancer freelancer);

	void remove(Job job, Freelancer freelancer);

	BookmarkedJob findById(Long id);

	List<BookmarkedJob> findBookmarkedJobsBySkill(Skill skill, Freelancer freelancer);

}
