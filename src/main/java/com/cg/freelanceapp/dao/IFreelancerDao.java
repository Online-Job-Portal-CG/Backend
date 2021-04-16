package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.Freelancer;

public interface IFreelancerDao {

	Freelancer save(Freelancer freelancer);

	Freelancer update(Freelancer freelancer);

	Freelancer findById(Long id);

}
