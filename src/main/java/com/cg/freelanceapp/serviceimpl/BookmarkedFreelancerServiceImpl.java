package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IBookmarkedFreelancerDao;
import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedFreelancerException;
import com.cg.freelanceapp.exceptions.InvalidFreelancerException;
import com.cg.freelanceapp.exceptions.InvalidRecruiterException;
import com.cg.freelanceapp.exceptions.InvalidSkillException;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

/**
 * 
 * @author Vishnuvardhan Reddy 
 * Description: This is a service implementation
 *         		class for the BookmarkedFreelancer Entity
 *
 */
@Service
public class BookmarkedFreelancerServiceImpl implements IBookmarkedFreelancerService {

	@Autowired
	IBookmarkedFreelancerDao bookmarkedFreelancerDao;

	@Autowired
	ISkillDao skillDao;

	@Autowired
	IFreelancerDao freelancerDao;

	@Autowired
	IRecruiterDao recruiterDao;

	/**
	 * Method: bookmarkFreelancer
	 * 
	 * @param bookmarkFreelancerDto
	 * @throws InvalidBookmarkedFreelancerException, InvalidRecruiterException,
	 *                                               InvalidSkillException,
	 *                                               InvalidFreelancerException
	 *                                               
	 * Description: This method creates a bookmark of an existing freelancer. 
	 * 				The recruiter can create a bookmark of the freelancer.
	 */
	@Override
	public BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto) {
		BookmarkedFreelancer bookmarkedFreelancer = new BookmarkedFreelancer();
		if (recruiterDao.existsById(bookmarkedFreelancerDto.getRecruiterId())) {
			bookmarkedFreelancer.setBookmarkedBy(recruiterDao.findById(bookmarkedFreelancerDto.getRecruiterId()).get());
		} else
			throw new InvalidRecruiterException();
		if (freelancerDao.existsById(bookmarkedFreelancerDto.getFreelancerId())) {
			bookmarkedFreelancer.setFreelancer(freelancerDao.findById(bookmarkedFreelancerDto.getFreelancerId()).get());
		} else
			throw new InvalidFreelancerException();
		if (skillDao.existsById(bookmarkedFreelancerDto.getSkillId())) {
			bookmarkedFreelancer.setSkill(skillDao.findById(bookmarkedFreelancerDto.getSkillId()).get());
		} else
			throw new InvalidSkillException();

		return bookmarkedFreelancerDao.save(bookmarkedFreelancer);
	}

	/**
	 * 
	 * @param skillName
	 * @throws InvalidBookmarkedFreelancerException Description: The method finds a
	 *                                              bookmarked freelancer by the
	 *                                              skill name, and returns a list.
	 * 
	 */
	@Override
	public List<BookmarkedFreelancer> findBookmarkedFreelancersBySkillName(String skillName) {
		return bookmarkedFreelancerDao.findBookmarkedFreelancerBySkillName(skillName);
	}

	/**
	 * 
	 * @param id
	 * @throws InvalidBookmarkedFreelancer Description: The method finds
	 *                                     BookmarkedFreelancers by their Id, and
	 *                                     returns a list.
	 * 
	 */
	@Override
	public BookmarkedFreelancer findById(Long id) {
		if (bookmarkedFreelancerDao.existsById(id)) {
			return bookmarkedFreelancerDao.findById(id).get();
		} else
			throw new InvalidBookmarkedFreelancerException();

	}

	@Override
	public void deleteBookmarkedFreelancerById(Long id) {
		if (bookmarkedFreelancerDao.existsById(id)) {
			bookmarkedFreelancerDao.deleteById(id);
		} else {
			throw new InvalidBookmarkedFreelancerException();
		}

	}

}
