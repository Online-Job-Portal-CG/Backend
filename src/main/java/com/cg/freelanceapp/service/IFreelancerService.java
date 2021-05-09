package com.cg.freelanceapp.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.FreelancerDTO;
import com.cg.freelanceapp.entities.Freelancer;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Interface for Freelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface IFreelancerService {

	Freelancer findById(Long id);

	Freelancer save(FreelancerDTO freelancerDto);

	Long getCurrentId();

	Freelancer update(@Valid Long id, FreelancerDTO freelancerDto);
}
