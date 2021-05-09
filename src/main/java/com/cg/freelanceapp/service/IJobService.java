package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.entities.Job;

@Service
public interface IJobService {

	void close(Long id);

	Job findById(Long id);
	
	List<Job> findJobsBySkillName(String name);
	
	Job postJob(JobDTO jobDto);
}
