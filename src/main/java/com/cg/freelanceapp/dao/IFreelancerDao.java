package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Freelancer;

@Repository
public interface IFreelancerDao extends JpaRepository<Freelancer, Long>{

}
