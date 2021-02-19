package com.craterzone.demo.model;

import javax.persistence.Id;

public class User {

	@Id
	private int user_id;
	private  String firstName;
	private String lastName;
	private long dateOfBirth;
	private String email;
 	private  Address address;
	private  long created;
	private  long updated;
	private  String emailPassword;
	
	
	
	public User() {
		super();
	
	}
	public User( String firstName, String lastName, long dateOfBirth, String email, Address address,
			long created, long updated, String emailPassword) {
		super();
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.address = address;
		this.created = created;
		this.updated = updated;
		this.emailPassword = emailPassword;
	}
	public void setId(int id) {
		this.user_id=id;
	}
	
	public int getId() {
		return this.user_id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public long getUpdated() {
		return updated;
	}
	public void setUpdated(long updated) {
		this.updated = updated;
	}
	public String getEmailPassword() {
		return emailPassword;
	}
	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

	
}
