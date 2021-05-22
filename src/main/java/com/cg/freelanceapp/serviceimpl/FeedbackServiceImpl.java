package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFeedbackDao;
import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.dto.FeedbackDTO;
import com.cg.freelanceapp.dto.FeedbackListDTO;
import com.cg.freelanceapp.entities.Feedback;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.exceptions.InvalidFeedbackException;
import com.cg.freelanceapp.service.IFeedbackService;

@Service
public class FeedbackServiceImpl implements IFeedbackService {

	@Autowired
	IFeedbackDao feedbackDao;

	@Autowired
	IRecruiterDao recruiterDao;

	@Autowired
	IFreelancerDao freelancerDao;

	@Override
	public Float averageRating(String id) {
		if (freelancerDao.existsByUserName(id)) {
			return feedbackDao.averageRatings(id);
		}else throw new InvalidFeedbackException();
	}

	@Override
	public Feedback addFeedback(FeedbackDTO feedbackDto) {
		System.out.println(feedbackDto.toString());
		if (recruiterDao.existsByUserName(feedbackDto.getRecruiterUName())
				&& freelancerDao.existsByUserName(feedbackDto.getFreelancerUName())) {
			
			Recruiter recruiter = recruiterDao.findByUserName(feedbackDto.getRecruiterUName());
			Freelancer freelancer = freelancerDao.findByUserName(feedbackDto.getFreelancerUName());
			Feedback feedback = new Feedback();

			feedback.setComment(feedbackDto.getComments());
			feedback.setRanges(feedbackDto.getRanges());
			feedback.setCreatedBy(recruiter);
			feedback.setCreatedFor(freelancer);

			return feedbackDao.save(feedback);
		} else
			throw new InvalidFeedbackException();

	}

	@Override
	public List<FeedbackListDTO> findFeedbacksForFreelancerByRecruiter(String fId, String rId) {

		return feedbackDao.findFeedbacksForFreelancerByRecruiterId(fId, rId);
	}

}
