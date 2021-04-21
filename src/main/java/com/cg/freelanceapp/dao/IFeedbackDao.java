package com.cg.freelanceapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;

@Repository
public interface IFeedbackDao extends JpaRepository<Feedback, Long>{
	//int averageRating(Freelancer freelancer);
	//List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
}
