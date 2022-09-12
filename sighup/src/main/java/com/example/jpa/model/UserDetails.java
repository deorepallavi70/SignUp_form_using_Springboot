package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class UserDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotNull
	private String Fname;
	
	private String Lname;
	private String Password;
	
	@NotNull
	private String Email;
	
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", Fname=" + Fname + ",Email" + Email + " Lname=" + Lname + ", Password=" + Password
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	
	public UserDetails(int id, String fname, String lname, String password, String email) 
	{
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		Password = password;
         Email = email;
	}
	
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}