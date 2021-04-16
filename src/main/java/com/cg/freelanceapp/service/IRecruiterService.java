package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Recruiter;

public interface IRecruiterService {
	
	Recruiter save(Recruiter recruiter);

	Recruiter update(Recruiter recruiter);

	Recruiter findById(Long id);

}
