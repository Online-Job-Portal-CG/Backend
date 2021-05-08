package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Feedback;

@Repository
public interface IFeedbackDao extends JpaRepository<Feedback, Long> {
	@Query("select fb from Feedback fb where fb.createdFor.id=:id")
	public List<Feedback> findFeedbacksByFreelancerId(@Param("id") Long id);
}
