package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.JobApplication;

@Service
public interface IJobApplicationService {

	JobApplication applyToJob(Job job, String coverLetter, Freelancer freelancer);

	JobApplication findById(Long id);

	void remove(Job job, Freelancer freelancer);

	JobApplication updateJobApplication(Job job, String coverLetter, Freelancer freelancer);
}
