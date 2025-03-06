package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.ResetPass;
import com.example.demo.entities.User;
import com.example.demo.entities.UserLogin;

public interface UserService {

	void forgotPassword(UserLogin l);

	void ResetPassword(ResetPass e);

	void addU(User u);

	List<User> getUD();



}
