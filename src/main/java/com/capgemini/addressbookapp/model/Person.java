package com.capgemini.addressbookapp.model;

import com.capgemini.addressbookapp.dto.PersonDTO;

import lombok.Data;

public @Data class Person {
	private int id;
	private String pName;
	private String contact;
	private String address;
	private String city;
	private String state;
	private String zip;
	public Person(int id, PersonDTO person) {
		this.setId(id);
		this.pName = person.pName;
		this.contact = person.contact;
		this.address = person.address;
		this.city = person.city;
		this.state = person.state;
		this.zip = person.zip;
	}
}
