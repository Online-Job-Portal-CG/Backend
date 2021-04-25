package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(Job job, Freelancer freelancer);

	List<BookmarkedJob> findBookmarkedJobsBySkill(Skill skill, Freelancer freelancer);

	BookmarkedJob findById(Long id);

	void remove(Job job, Freelancer freelancer);

}
