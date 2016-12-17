package com.learn.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	private int id;

	@Size(min = 4, max = 20, message = "First Name length must be 4 to 20 characters")
	@NotNull(message = "First Name is a required field")
	private String firstName;

	@NotNull(message = "Last Name is a required field")
	private String lastName;

	@NotNull(message = "User Id is a required field")
	private String userId;

	@NotNull(message = "Password is a required field")
	@Size(min = 6, max = 20, message = "Password length must be 6 to 20 characters")
	private String password;

	@NotNull(message = "Email is a required field")
	private String email;

	private Date creationDate;

	private String active;

	public User(int id, String firstName, String lastName, String userId, String password, String email,
			Date creationDate, String isActive) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.creationDate = creationDate;
		this.active = isActive;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String isActive) {
		this.active = isActive;
	}

	@Override
	public String toString() {
		return String.format(
				"ToString - User [id=%s, firstName=%s, lastName=%s, userId=%s, password=%s, email=%s, creationDate=%s, isActive=%s]",
				id, firstName, lastName, userId, password, email, creationDate, active);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
