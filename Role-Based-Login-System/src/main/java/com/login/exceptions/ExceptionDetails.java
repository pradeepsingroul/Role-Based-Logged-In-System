package com.login.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExceptionDetails {
	
	private LocalDateTime timeStamp;
		
	private String message ;
		
	private String description;

	

}
