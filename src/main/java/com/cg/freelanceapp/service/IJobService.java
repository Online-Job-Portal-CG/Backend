package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IJobService {

	Job postJob(Skill skill, Recruiter recruiter);

	Job findById(Long id);

	List<Job> findJobsBySkill(Skill skill);

	void closeJob(Job job);
}
