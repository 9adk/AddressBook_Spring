package com.capgemini.addressbookapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.addressbookapp.dto.PersonDTO;
import com.capgemini.addressbookapp.dto.ResponseDTO;
import com.capgemini.addressbookapp.model.Person;
import com.capgemini.addressbookapp.service.IAddressBookService;
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@Autowired
	IAddressBookService addressBookService;
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("id") int id) {
		
		Person perObj = addressBookService.getPersonById(id);
		ResponseDTO response = new ResponseDTO("The person data for id: "+id+"is",perObj);
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		List<Person> personList = addressBookService.getPersonData();
		ResponseDTO response = new ResponseDTO("The AddressBook contains",personList);
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> newAddressBook(@RequestBody PersonDTO person){
		Person perObj = addressBookService.addPerson(person);
		ResponseDTO response = new ResponseDTO("Added the person in addressbook",perObj);
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBook(@PathVariable("id") int id,@RequestBody PersonDTO person){
		Person perObj = addressBookService.updatePerson(id,person);
		ResponseDTO response = new ResponseDTO("Updated the person data in addressbook",perObj);
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookById(@PathVariable("id") int id){
		addressBookService.deletePerson(id);
		ResponseDTO response = new ResponseDTO("Deleted the data of id: ",id);
		return new ResponseEntity<ResponseDTO>(response,HttpStatus.OK);
	}

}
