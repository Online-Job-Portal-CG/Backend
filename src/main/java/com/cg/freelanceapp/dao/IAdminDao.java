package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.Admin;

public interface IAdminDao {
	
	Admin save(Admin admin);

	Admin update(Admin admin);

	Admin findById(Long id);
}
