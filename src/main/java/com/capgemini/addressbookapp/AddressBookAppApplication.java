package com.capgemini.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(AddressBookAppApplication.class, args);
		log.info("AddressBook app Started");
	}
}
