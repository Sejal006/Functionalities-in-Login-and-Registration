package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ResetPass;
import com.example.demo.entities.User;
import com.example.demo.entities.UserLogin;
import com.example.demo.repos.UserRepo;
import com.example.demo.services.UserService;

@Service
public class UserDao implements UserService {

	@Autowired
	UserRepo repo;

	@Override
	public void forgotPassword(UserLogin l) {
		User u = repo.findByEmail(l.getEmail());
		u.setFull_name(u.getFull_name());
		u.setEmail(u.getEmail());
		u.setPassword_hash(l.getPassword_hash());
		u.setRole(u.getRole());
		repo.save(u);		
	}

	@Override
	public void ResetPassword(ResetPass e) {
		User u = repo.findByEmail(e.getEmail());
		u.setPassword_hash(e.getPassword_hash());
		u.setPassword_hash(e.getNewpassword());
		
		repo.save(u);
		
	}

	@Override
	public void addU(User u) {
		repo.save(u);
	}

	@Override
	public List<User> getUD() {
		
		return (List<User>) repo.findAll();
	}
	
	

}
