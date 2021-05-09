package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Job;

@Repository
public interface IJobDao extends JpaRepository<Job, Long> {
	@Query("SELECT j from Job j where j.skill.name = :name")
	public List<Job> findJobBySkillName(@Param("name") String name);

}
