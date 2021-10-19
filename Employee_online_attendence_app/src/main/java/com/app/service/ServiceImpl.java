package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AdminRepository;
import com.app.modal.Admin;
@Service
public class ServiceImpl implements AdminService{
	
	private AdminRepository adminrepository;

	@Autowired
	public ServiceImpl(AdminRepository adminrepository) {
		super();
		this.adminrepository=adminrepository;
	}


	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminrepository.findAll();
	}

}
