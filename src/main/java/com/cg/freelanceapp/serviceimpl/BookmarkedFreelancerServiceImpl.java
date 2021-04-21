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
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

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

	@Override
	public BookmarkedFreelancer bookmarkFreelancer(BookmarkedFreelancerDTO bookmarkedFreelancerDto) {
		BookmarkedFreelancer bookmarkedFreelancer = new BookmarkedFreelancer();
		bookmarkedFreelancer.setBookmarkedBy(recruiterDao.findById(bookmarkedFreelancerDto.getRecruiterId()).get());
		bookmarkedFreelancer.setFreelancer(freelancerDao.findById(bookmarkedFreelancerDto.getFreelancerId()).get());
		bookmarkedFreelancer.setSkill(skillDao.findById(bookmarkedFreelancerDto.getSkillId()).get());
		return bookmarkedFreelancerDao.save(bookmarkedFreelancer);
	}

	@Override
	public List<BookmarkedFreelancer> findBookmarkedFreelancersBySkillId(Long id) {
		return bookmarkedFreelancerDao.findBookmarkedFreelancerBySkillId(id);
	}

	@Override
	public void removeBookmarkedFreelancer(BookmarkedFreelancer bookmarkedFreelancer) {
		// TODO Auto-generated method stub

	}

	@Override
	public BookmarkedFreelancer findById(Long id) {

		return bookmarkedFreelancerDao.findById(id).get();
	}

}
