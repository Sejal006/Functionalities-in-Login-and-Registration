package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.User;

public interface AdminRepo extends CrudRepository<Admin,Integer>{

	Admin findByEmail(String email);

	void save(User u);
	

}
