package com.whroid.ee.whros.base.entity;

import org.springframework.http.HttpStatus;

public class ResponseEntity<T> extends org.springframework.http.ResponseEntity<Payload<T>> {

	public ResponseEntity(Payload<T> payload, HttpStatus status) {
		super(payload, status);
	}

}
