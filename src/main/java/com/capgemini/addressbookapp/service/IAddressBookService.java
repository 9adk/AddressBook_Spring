package com.capgemini.addressbookapp.service;

import java.util.List;

import com.capgemini.addressbookapp.dto.PersonDTO;
import com.capgemini.addressbookapp.exception.AddressBookException;
import com.capgemini.addressbookapp.model.Person;

public interface IAddressBookService {
	Person addPerson(PersonDTO person);
	List<Person> getPersonData();
	Person getPersonById(int id) throws AddressBookException;
	Person updatePerson(int id, PersonDTO person) throws AddressBookException;
	void deletePerson(int id);
}
