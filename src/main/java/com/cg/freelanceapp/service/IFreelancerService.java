package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;

@Service
public interface IFreelancerService {

	Freelancer save(FreelancerDTO freelancerDto);

	Freelancer update(Freelancer freelancer);

	Freelancer findById(Long id);
}
