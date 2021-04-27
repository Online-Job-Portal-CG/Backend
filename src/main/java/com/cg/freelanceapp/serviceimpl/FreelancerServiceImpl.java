package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.service.IFreelancerService;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Implementation for Freelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
@Transactional
public class FreelancerServiceImpl implements IFreelancerService {

	@Autowired
	IFreelancerDao freelancerDao;

	@Override
	public Freelancer findById(Long id) {
		return freelancerDao.findById(id).get();
	}

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
	
	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Override
	public Long getCurrentId() {
		return freelancerDao.getCurrentSeriesId();
	}

}
