package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.RecruiterDTO;
import com.cg.freelanceapp.entities.Recruiter;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Interface for Recruiter module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface IRecruiterService {

	Recruiter findById(Long id);

	Recruiter save(RecruiterDTO recruiterdto);

	Recruiter update(Recruiter recruiter);

	Long getCurrentId();
}
