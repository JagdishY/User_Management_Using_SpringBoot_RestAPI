package com.user.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class UserExceptionHandler {

	//NullPointerException
	@ExceptionHandler
	public ResponseEntity<String> handleNullPointerException(NullPointerException exception,
			HttpServletRequest request) {

		System.out.println(exception.getMessage());
		System.out.println(request.getContextPath());
		System.out.println(request.getPathInfo());

		return new ResponseEntity<String>("Please Provide valid data ", HttpStatus.BAD_REQUEST);
	}
	
	//NoResourceFoundException
	@ExceptionHandler
	public ResponseEntity<String> handleNoResourceFoundException(NoResourceFoundException exception,
			HttpServletRequest request) {

		System.out.println(exception.getMessage());
		System.out.println(request.getContextPath());
		System.out.println(request.getPathInfo());

		return new ResponseEntity<String>("Resource Cannot be Empty ", HttpStatus.NOT_FOUND);
	}

	
	//EntityNotFoundException
	@ExceptionHandler
	public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException exception,
			HttpServletRequest request) {

		System.out.println(exception.getMessage());
		System.out.println(request.getContextPath());
		System.out.println(request.getPathInfo());

		return new ResponseEntity<String>("Please Provide Valid Id....", HttpStatus.NOT_FOUND);
	}


	//MethodArgumentNotValidException
	@ExceptionHandler
	public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception,
			HttpServletRequest request) {

		System.out.println(exception.getMessage());
		System.out.println(request.getContextPath());
		System.out.println(request.getPathInfo());

		return new ResponseEntity<String>("Please provide all required data to process, Name Should be Min 5 and Max 30 , Email Should be proper format ", HttpStatus.BAD_REQUEST);
	}










}
