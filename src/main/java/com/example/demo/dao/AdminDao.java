package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.User;
import com.example.demo.repos.AdminRepo;
import com.example.demo.services.AdminService;

@Service
public class AdminDao implements AdminService {
	
	@Autowired
	AdminRepo arepo;

	@Override
	public void addDetail(Admin a) {
		arepo.save(a);
		
	}

	@Override
	public void saveU(User u) {
		arepo.save(u);
		
	}
	

		

}
