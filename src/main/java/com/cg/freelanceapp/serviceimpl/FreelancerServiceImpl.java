package com.cg.freelanceapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.dto.FreelancerListDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.exceptions.InvalidFreelancerException;
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
		if (freelancerDao.existsById(id)) {
			return freelancerDao.findById(id).get();
		} else
			throw new InvalidFreelancerException();
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

	@Override
	public Freelancer save(FreelancerDTO freelancerDto) {
		Freelancer freelancer = new Freelancer();
		freelancer.setFirstName(freelancerDto.getFirstName());
		freelancer.setLastName(freelancerDto.getLastName());
		freelancer.setPassword(freelancerDto.getPassword());
		freelancer.setUserName(freelancerDto.getUserName());
		if (!(freelancerDto.getFirstName() == null || freelancerDto.getLastName() == null
				|| freelancerDto.getPassword() == null || freelancerDto.getUserName() == null))
			return freelancerDao.save(freelancer);
		else
			throw new InvalidFreelancerException();
	}

	@Override
	public Freelancer update(Long id, FreelancerDTO freelancerDto) {
		if (freelancerDao.existsById(id)) {
			Freelancer freelancer = freelancerDao.findById(id).get();
			freelancer.setFirstName(freelancerDto.getFirstName());
			freelancer.setLastName(freelancerDto.getLastName());
			freelancer.setPassword(freelancerDto.getPassword());
			freelancer.setUserName(freelancerDto.getUserName());
			return freelancerDao.save(freelancer);
		} else {
			throw new InvalidFreelancerException();
		}

	}

	@Override
	public Freelancer findByUserName(String userName) {
		if (freelancerDao.existsByUserName(userName)) {
			return freelancerDao.findByUserName(userName);
		} else {
			throw new InvalidFreelancerException();
		}
	}

	@Override
	public List<FreelancerListDTO> listFreelancers() {
		return freelancerDao.findAllFreelancers();
	}

}
