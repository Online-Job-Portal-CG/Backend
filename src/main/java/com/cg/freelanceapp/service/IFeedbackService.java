package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;

@Service
public interface IFeedbackService {

	int averageRating(Freelancer freelancer);

	Feedback createFeedback(Feedback feedback);

	List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer);
}
