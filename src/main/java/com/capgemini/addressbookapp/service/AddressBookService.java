package com.capgemini.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.addressbookapp.dto.PersonDTO;
import com.capgemini.addressbookapp.exception.AddressBookException;
import com.capgemini.addressbookapp.model.Person;

@Service
public class AddressBookService implements IAddressBookService {
	List<Person> list = new ArrayList<>();
	
	@Override
	public Person addPerson(PersonDTO person) {
		Person perObj = new Person(list.size()+1,person);
		list.add(perObj);
		return perObj;
	}
	@Override
	public List<Person> getPersonData(){
		return list;
	}
	@Override
	public Person getPersonById(int id) throws AddressBookException {
		return list.stream().filter(person -> person.getId() == id).findFirst().orElseThrow(() -> new AddressBookException("Person not found"));
	}
	@Override
	public Person updatePerson(int id, PersonDTO person) throws AddressBookException {
		Person perObj = this.getPersonById(id);
		perObj.setPName(person.pName);
		perObj.setContact(person.contact);
		perObj.setAddress(person.address);
		perObj.setCity(person.city);
		perObj.setState(person.state);
		perObj.setZip(person.zip);
		
		return perObj;
	}
	@Override
	public void deletePerson(int id) {
		list.remove(id-1);
	}
}
