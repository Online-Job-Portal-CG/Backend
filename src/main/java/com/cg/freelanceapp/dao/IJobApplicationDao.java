package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.JobApplication;

@Repository
public interface IJobApplicationDao extends JpaRepository<JobApplication, Long> {

}
