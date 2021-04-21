package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFeedbackDao;
import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.service.IFeedbackService;

@Service
public class FeedbackServiceImpl implements IFeedbackService{

	@Autowired
	IFeedbackDao feedbackDao;
	
	@Override
	public Feedback createFeedback(Feedback feedback) {
		
		return feedbackDao.save(feedback);
	}

	@Override
	public int averageRating(Freelancer freelancer) {
		return 0;
	}

	@Override
	public List<Feedback> findFeedbacksByFreelancer(Freelancer freelancer) {
		return null;
	}

}
