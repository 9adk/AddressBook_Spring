package com.capgemini.addressbookapp.dto;
public class PersonDTO {
	public String pName;
	public String contact;
	public String address;
	public String city;
	public String state;
	public String zip;
	@Override
	public String toString() {
		return "PersonDTO [pName=" + pName + ", pNo=" + contact + ", address=" + address + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + "]";
	}
	public PersonDTO(String pName, String contact, String address, String city, String zip, String state) {
		super();
		this.pName = pName;
		this.contact = contact;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.state = state;
	};
	
}
