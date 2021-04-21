package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Job;

@Repository
public interface IJobDao extends JpaRepository<Job, Long>{
}
