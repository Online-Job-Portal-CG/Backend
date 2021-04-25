package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.RecruiterDTO;
import com.cg.freelanceapp.entities.Recruiter;

@Service
public interface IRecruiterService {
	
	Recruiter save(RecruiterDTO recruiterdto);

	Recruiter update(Recruiter recruiter);

	Recruiter findById(Long id);
	

}
