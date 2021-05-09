package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.IJobApplicationDao;
import com.cg.freelanceapp.dao.IJobDao;
import com.cg.freelanceapp.dto.JobApplicationDTO;
import com.cg.freelanceapp.entities.JobApplication;
import com.cg.freelanceapp.exceptions.InvalidJobApplicationException;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.service.IJobApplicationService;

/**************************************************************************************
 * @author       Siddhesh
 * Description : This is the Service Implementation for JobApplication module. 
 * Created Date: 26 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/

@Service
@Transactional
public class JobApplicationServiceImpl implements IJobApplicationService {
	
	@Autowired
	IJobApplicationDao jobApplicationDao;
	
	@Autowired
	IJobDao jobDao;

	@Override
	public JobApplication applyToJob(JobApplicationDTO jobApplicationDto) {
		JobApplication jobApplication= new JobApplication();
		if(!jobApplicationDto.getCoverLetter().isEmpty()||jobApplicationDto.getJobId()!=null) {
			jobApplication.setCoverLetter(jobApplicationDto.getCoverLetter());
			if(jobDao.existsById(jobApplicationDto.getJobId())) {
				jobApplication.setJob(jobDao.findById(jobApplicationDto.getJobId()).get());
				return jobApplicationDao.save(jobApplication);
			}else {
				throw new InvalidJobException();
			}
			
			
			
		}
		else {
			throw new InvalidJobApplicationException();
		}
	}


	@Override
	public JobApplication findById(Long id) {
		if(jobApplicationDao.existsById(id)) {
		return jobApplicationDao.findById(id).get();
		}else {
			throw new InvalidJobApplicationException();
		}
	}


	@Override
	public void remove(Long id) {
		if(jobApplicationDao.existsById(id)) {
		jobApplicationDao.deleteById(id);
		}else {
			throw new InvalidJobApplicationException();
		}
		
	}

	
	@Override
	public JobApplication updateJobApplication(Long id, JobApplicationDTO jobApplicationDto) {
		if(jobApplicationDao.existsById(id)) {
			JobApplication jobApplication=jobApplicationDao.findById(id).get();
			jobApplication.setCoverLetter(jobApplicationDto.getCoverLetter());
			System.out.println(jobApplication.getCoverLetter());
			jobApplication.setJob(jobDao.findById(jobApplicationDto.getJobId()).get());
			jobApplicationDao.save(jobApplication);
			return jobApplication;
		}else {
			throw new InvalidJobApplicationException();
		}
		
		
	}

}