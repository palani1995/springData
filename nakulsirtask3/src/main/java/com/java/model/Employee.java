package com.java.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	private Integer id;
	private String name;
	private Set<Address> addresses;
	private Set<Phone> phone;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="aaid",referencedColumnName="id")
	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	

	@Column
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ppid",referencedColumnName="id")
	public Set<Phone> getPhone() {
		return phone;
	}

	public void setPhone(Set<Phone> phone) {
		this.phone = phone;
	}

}
