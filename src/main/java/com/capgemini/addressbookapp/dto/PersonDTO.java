package com.capgemini.addressbookapp.dto;
public class PersonDTO {
	public String pName;
	public String pNo;
	public String address;
	public String city;
	public String state;
	public String zip;
	@Override
	public String toString() {
		return "PersonDTO [pName=" + pName + ", pNo=" + pNo + ", address=" + address + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + "]";
	}
	public PersonDTO(String pName, String pNo, String address, String city, String zip, String state) {
		super();
		this.pName = pName;
		this.pNo = pNo;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.state = state;
	};
	
}
