package com.capgemini.addressbookapp.model;

import com.capgemini.addressbookapp.dto.PersonDTO;

public class Person {
	private int id;
	private String pName;
	private String pNo;
	private String address;
	private String city;
	private String state;
	private String zip;
	public Person(int id, PersonDTO person) {
		this.setId(id);
		this.pName = person.pName;
		this.pNo = person.pNo;
		this.address = person.address;
		this.city = person.city;
		this.state = person.state;
		this.zip = person.zip;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
