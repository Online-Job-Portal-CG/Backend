package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.freelanceapp.dao.IAdminDao;
import com.cg.freelanceapp.dto.AdminDTO;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.exceptions.InvalidAdminException;
import com.cg.freelanceapp.service.IAdminService;

public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminDao adminDao;

	@Override
	public Admin findById(Long id) {
		if (adminDao.existsById(id)) {
			return adminDao.findById(id).get();
		} else {
			throw new InvalidAdminException();
		}
	}

	@Override
	public Admin save(AdminDTO adminDto) {
		Admin admin = new Admin();
		String firstName = adminDto.getFirstName();
		String lastName = adminDto.getLastName();
		String password = adminDto.getPassword();
		if (!(firstName == null || lastName == null || password == null)) {
			admin.setFirstName(firstName);
			admin.setLastName(lastName);
			admin.setPassword(password);
			return adminDao.save(admin);
		} else
			throw new InvalidAdminException();

	}

	@Override
	public Admin update(Long id, AdminDTO adminDto) {
		if (adminDao.existsById(id)) {
			Admin admin = adminDao.findById(id).get();
			admin.setPassword(adminDto.getPassword());
			return adminDao.save(admin);
		} else {
			throw new InvalidAdminException();
		}
	}

}
