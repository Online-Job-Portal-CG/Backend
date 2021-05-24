package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.RecruiterDTO;
import com.cg.freelanceapp.dto.RecruiterListDTO;
import com.cg.freelanceapp.entities.Recruiter;

/**************************************************************************************
 * @author       Aditya 
 * Description : This is the Service Interface for Recruiter module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface IRecruiterService {

	Recruiter findById(Long id);

	Long getCurrentId();

	Recruiter save(RecruiterDTO recruiterdto);

	Recruiter update(Long id, RecruiterDTO recruiterDto);
	
	Recruiter findByUserName(String userName);
	
	List<RecruiterListDTO> findAll();
}
