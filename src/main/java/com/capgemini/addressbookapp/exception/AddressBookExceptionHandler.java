package com.capgemini.addressbookapp.exception;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.capgemini.addressbookapp.dto.ResponseDTO;
@ControllerAdvice
public class AddressBookExceptionHandler {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
		List<ObjectError> errList = exception.getBindingResult().getAllErrors();
		List<String> errMessages = errList.stream()
				            .map(error -> error.getDefaultMessage()).collect(Collectors.toList());
		ResponseDTO respDTO = new ResponseDTO("Exception occured", errMessages);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.BAD_REQUEST);	
	}
	
	@ExceptionHandler(AddressBookException.class)
	public ResponseEntity<ResponseDTO> handleEmployeeException(AddressBookException exception){
		ResponseDTO respDTO = new ResponseDTO("Exception occured", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.BAD_REQUEST);	
	}

}
