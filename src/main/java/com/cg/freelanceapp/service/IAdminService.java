package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.AdminDTO;
import com.cg.freelanceapp.entities.Admin;

@Service
public interface IAdminService {
	Admin findById(Long id);

	Admin save(AdminDTO adminDto);

	Admin update(Long id, AdminDTO adminDto);
	
	Admin findByUserName(String userName);

}
