package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Admin;

@Service
public interface IAdminService {
	Admin findById(Long id);

	Admin save(Admin admin);

	Admin update(Admin admin);

}
