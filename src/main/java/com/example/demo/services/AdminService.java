package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Admin;
import com.example.demo.entities.User;

@Service
public interface AdminService {

	void addDetail(Admin a);

	void saveU(User u);

	

	

}
