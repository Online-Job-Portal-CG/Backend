package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Freelancer;

@Service
public interface IFreelancerService {

	Freelancer save(Freelancer freelancer);

	Freelancer update(Freelancer freelancer);

	Freelancer findById(Long id);
}
