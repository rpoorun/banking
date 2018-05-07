package com.accenture.aa.banking.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends User{
	
	@Id
	@Column(name="CUSTOMER_ID")
	private Long customerId;
	

}
