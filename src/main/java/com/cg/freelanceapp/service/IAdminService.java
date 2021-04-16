package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Admin;

public interface IAdminService {
	Admin save(Admin admin);

	Admin update(Admin admin);

	Admin findById(Long id);

}
