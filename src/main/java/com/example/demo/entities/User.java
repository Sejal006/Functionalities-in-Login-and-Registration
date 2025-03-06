package com.example.demo.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;
	
	@NotNull
	private String full_name;
	
	@NotNull
	@Column(unique = true)
	private String email;
	
	@NotNull
	private String password_hash;
	
	@NotNull
	private String role;
	public enum Status{
		ACTIVE,
		INACTIVE
	}
	  @Enumerated(EnumType.STRING)  // Maps Enum to a string in the database
	    @Column(nullable = false)
	    private Status status = Status.ACTIVE;
	  
	  
	    @CreationTimestamp
	    @Column(nullable = false, updatable = false)
	     private LocalDateTime createdAt;
	    
	    public LocalDateTime getCreatedAt() {
			return createdAt;
		}

         public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}


      public User(LocalDateTime createdAt) {
			super();
			this.createdAt = createdAt;
		}

	    
	    
	    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, @NotNull String full_name, @NotNull String email, @NotNull String password_hash,
			@NotNull String role, Status status) {
		super();
		this.user_id = user_id;
		this.full_name = full_name;
		this.email = email;
		this.password_hash = password_hash;
		this.role = role;
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", full_name=" + full_name + ", email=" + email + ", password_hash="
				+ password_hash + ", role=" + role + ", status=" + status + "]";
	}

	
  


	

	
	
	
	
}
