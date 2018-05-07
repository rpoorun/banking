package com.accenture.aa.banking.dao.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="USER_TYPE")
public class User {

	@Id
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "USERNAME", nullable = false, length = 20)
	private String username;
	
	@Column(name = "PASSWORd", nullable = false, length = 20)
	private String password;
	
	@Column(name = "FIRST_NAME", nullable=false)
	private String firstName;
	
	@Column(name = "LAST_NAME", nullable=false)
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
