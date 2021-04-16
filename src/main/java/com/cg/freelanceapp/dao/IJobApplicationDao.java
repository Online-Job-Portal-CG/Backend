package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.JobApplication;

public interface IJobApplicationDao {
	
	JobApplication save(JobApplication jobApplication);

	JobApplication update(JobApplication jobApplication);

	void remove(JobApplication jobApplication);
}
