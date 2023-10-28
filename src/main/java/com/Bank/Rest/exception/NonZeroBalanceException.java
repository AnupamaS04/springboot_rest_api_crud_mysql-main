package com.Bank.Rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NonZeroBalanceException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4712158753129227412L;

	public NonZeroBalanceException(String message) {
        super(message);
    }
}

