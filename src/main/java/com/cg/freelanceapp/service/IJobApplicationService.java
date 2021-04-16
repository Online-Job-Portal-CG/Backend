package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.JobApplication;

public interface IJobApplicationService {
	
	JobApplication save(JobApplication jobApplication);

	JobApplication update(JobApplication jobApplication);

	void remove(JobApplication jobApplication);
}
