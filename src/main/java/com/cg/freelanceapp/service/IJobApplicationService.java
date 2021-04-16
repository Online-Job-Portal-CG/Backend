package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.JobApplication;

public interface IJobApplicationService {

	JobApplication applyToJob(Job job, String coverLetter, Freelancer freelancer);

	JobApplication updateJobApplication(Job job, String coverLetter, Freelancer freelancer);

	void remove(Job job, Freelancer freelancer);
	
	JobApplication findById(Long id);
}
