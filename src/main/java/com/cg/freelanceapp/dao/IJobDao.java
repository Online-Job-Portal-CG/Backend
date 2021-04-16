package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.Job;

public interface IJobDao {

	Job save(Job job);

	Job findById(Long id);

	void remove(Job job);

	Job update(Job job);
}
