package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Recruiter;

@Repository
public interface IRecruiterDao extends JpaRepository<Recruiter, Long>{
}
