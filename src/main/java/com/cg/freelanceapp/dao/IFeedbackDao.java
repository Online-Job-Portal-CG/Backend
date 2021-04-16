package com.cg.freelanceapp.dao;

import java.util.List;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;

public interface IFeedbackDao {
	
	Feedback save(Feedback feedback);
	Feedback findById(Long id);
	Feedback update(Feedback feedback);
	int averageRating(Freelancer freelancer);
	List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
}
