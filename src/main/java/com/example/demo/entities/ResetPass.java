package com.example.demo.entities;

public class ResetPass {

	private String email;
	private String password_hash;
	private String newpassword;
	public ResetPass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResetPass(String email, String password_hash, String newpassword) {
		super();
		this.email = email;
		this.password_hash = password_hash;
		this.newpassword = newpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword_hash() {
		return password_hash;
	}
	public void setPassword_hash(String password_hash) {
		this.password_hash = password_hash;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	@Override
	public String toString() {
		return "ResetPass [email=" + email + ", password_hash=" + password_hash + ", newpassword=" + newpassword + "]";
	}
	
	
}
