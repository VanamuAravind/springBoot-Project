package com.okayjava.html.model;

public class User {
	
	private String name;
	private String email;
	private String passwd;
	private String dob;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", passwd=" + passwd + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}
	
	

}
