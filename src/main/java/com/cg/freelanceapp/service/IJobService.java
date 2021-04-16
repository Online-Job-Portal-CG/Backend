package com.cg.freelanceapp.service;

import java.util.List;

import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.entities.Skill;

public interface IJobService {

	Job postJob(Skill skill, Recruiter recruiter);

	Job findById(Long id);

	List<Job> findJobsBySkill(Skill skill);

	void closeJob(Job job);
}
