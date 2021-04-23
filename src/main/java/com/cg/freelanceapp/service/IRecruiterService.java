package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Recruiter;

@Service
public interface IRecruiterService {
	
	Recruiter save(Recruiter recruiter);

	Recruiter update(Recruiter recruiter);

	Recruiter findById(Long id);
	

}
