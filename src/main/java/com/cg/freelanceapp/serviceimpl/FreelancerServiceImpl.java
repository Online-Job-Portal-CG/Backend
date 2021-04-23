package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.service.IFreelancerService;

@Service
public class FreelancerServiceImpl implements IFreelancerService {

	@Autowired
	IFreelancerDao freelancerDao;

	@Override
	public Freelancer save(FreelancerDTO freelancerDto) {
		Freelancer freelancer = new Freelancer();
		freelancer.setFirstName(freelancerDto.getFirstName());
		freelancer.setLastName(freelancerDto.getLastName());
		freelancer.setPassword(freelancerDto.getPassword());
		return freelancerDao.save(freelancer);
	}

	@Override
	public Freelancer update(Freelancer freelancer) {
		return freelancerDao.save(freelancer);
	}

	@Override
	public Freelancer findById(Long id) {
		return freelancerDao.findById(id).get();
	}

}
