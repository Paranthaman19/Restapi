package com.Parama.in.user;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -8270891799551927704L;

	public  UserNotFoundException( String message) {
		super(message);
	}
}
