package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IRecruiterDao;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.service.IRecruiterService;

@Service
public class RecruiterServiceImpl implements IRecruiterService {

	@Autowired
	IRecruiterDao recruiterDao;

	@Override
	public Recruiter save(Recruiter recruiter) {
		return recruiterDao.save(recruiter);
	}

	@Override
	public Recruiter update(Recruiter recruiter) {
		return recruiterDao.save(recruiter);
	}

	@Override
	public Recruiter findById(Long id) {
		return recruiterDao.findById(id).get();
	}

}
