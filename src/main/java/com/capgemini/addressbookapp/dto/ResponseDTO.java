package com.capgemini.addressbookapp.dto;

import lombok.Data;

public @Data class ResponseDTO {
	private String message;
	private Object obj;
	public ResponseDTO(String message, Object obj) {
		super();
		this.message = message;
		this.obj = obj;
	}	
}
