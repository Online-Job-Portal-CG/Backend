package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Job;

public interface IJobService {

	Job save(Job job);

	Job findById(Long id);

	void remove(Job job);

	Job update(Job job);
}
