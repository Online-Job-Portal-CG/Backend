package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.FeedbackDTO;
import com.cg.freelanceapp.entities.Feedback;

@Service
public interface IFeedbackService {

	Float averageRating(Long id);

	Feedback createFeedback(FeedbackDTO feedbackDto);

	List<Feedback> findFeedbacksByFreelancer(Long id);
}
