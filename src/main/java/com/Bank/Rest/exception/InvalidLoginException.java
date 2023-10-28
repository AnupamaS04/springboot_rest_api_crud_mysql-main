package com.Bank.Rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidLoginException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6461038809191009942L;

	public InvalidLoginException(String message) {
        super(message);
    }
}

