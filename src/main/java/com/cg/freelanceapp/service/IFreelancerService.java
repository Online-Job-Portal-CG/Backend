package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Freelancer;

public interface IFreelancerService {

	Freelancer save(Freelancer freelancer);

	Freelancer update(Freelancer freelancer);

	Freelancer findById(Long id);
}
