package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.Recruiter;

public interface IRecruiterDao {

	Recruiter save(Recruiter recruiter);

	Recruiter update(Recruiter recruiter);

	Recruiter findById(Long id);

}
