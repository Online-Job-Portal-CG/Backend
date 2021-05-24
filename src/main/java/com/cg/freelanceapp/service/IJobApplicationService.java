package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.JobApplicationDTO;
import com.cg.freelanceapp.dto.JobApplicationsListDTO;
import com.cg.freelanceapp.entities.JobApplication;

/**************************************************************************************
 * @author       Siddhesh
 * Description : This is the Service Interface for JobApplication module. 
 * Created Date: 26 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/

@Service
public interface IJobApplicationService {

	JobApplication applyToJob(JobApplicationDTO jobApplicationDto);

	List<JobApplicationsListDTO> findAll();

	void remove(Long id);
	
	JobApplication updateJobApplication(Long id,JobApplicationDTO jobApplicationDto);
	
	List<JobApplicationsListDTO> findAllByJobId(Long jobId);
	
	List<JobApplicationsListDTO> findByFreelancerId(Long jobId, Long freelancerId);
}