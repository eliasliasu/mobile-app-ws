package com.belcode.app.ws.execptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.belcode.app.ws.user.ui.model.Response.ErrorMessage;

@ControllerAdvice
public class AppExecptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request){
		
		String errorMesageDescription = ex.getLocalizedMessage();
		
		if (errorMesageDescription == null) errorMesageDescription = ex.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMesageDescription);
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(value = {NullPointerException.class,UserServiceException.class})
	public ResponseEntity<Object> handleSpecificException(Exception ex, WebRequest request){
		
		String errorMesageDescription = ex.getLocalizedMessage();
		
		if (errorMesageDescription == null) errorMesageDescription = ex.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMesageDescription);
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
//	@ExceptionHandler(value = {UserServiceException.class})
//	public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest request){
//		
//		String errorMesageDescription = ex.getLocalizedMessage();
//		
//		if (errorMesageDescription == null) errorMesageDescription = ex.toString();
//		
//		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMesageDescription);
//		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//		
//	}
	
	
	
	

}
