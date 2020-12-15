package com.capgemini.addressbookapp.service;

import java.util.List;

import com.capgemini.addressbookapp.dto.PersonDTO;
import com.capgemini.addressbookapp.model.Person;

public interface IAddressBookService {
	Person addPerson(PersonDTO person);
	List<Person> getPersonData();
	Person getPersonById(int id);
	Person updatePerson(int id, PersonDTO person);
	void deletePerson(int id);
}
