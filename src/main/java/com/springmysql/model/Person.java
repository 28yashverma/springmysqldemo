package com.springmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer personId;
	private String name;
	private String address;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + "]";
	}

}
