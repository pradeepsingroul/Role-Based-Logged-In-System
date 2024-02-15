package com.login.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> allExceptionHandler(Exception ie, WebRequest req){

		ExceptionDetails err = new ExceptionDetails();
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<ExceptionDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ExceptionDetails> userExceptionHandler(UserException ie, WebRequest req){
		
		ExceptionDetails err = new ExceptionDetails();
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<ExceptionDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(RoleException.class)
	public ResponseEntity<ExceptionDetails> roleExceptionHandler(RoleException ie, WebRequest req){
		
		ExceptionDetails err = new ExceptionDetails();
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<ExceptionDetails>(err, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionDetails> methodArgsExceptionHandler(MethodArgumentNotValidException ie, WebRequest req){
		
		ExceptionDetails err = new ExceptionDetails();
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<ExceptionDetails>(err, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExceptionDetails> methodArgsExceptionHandler(NoHandlerFoundException ie, WebRequest req){
		
		ExceptionDetails err = new ExceptionDetails();
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<ExceptionDetails>(err, HttpStatus.BAD_REQUEST);
	}
	

	
}
