package com.Bank.Rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateAccountException extends RuntimeException 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2437144073812282642L;

	public DuplicateAccountException(String message) 
    {
        super(message);
    }
}
