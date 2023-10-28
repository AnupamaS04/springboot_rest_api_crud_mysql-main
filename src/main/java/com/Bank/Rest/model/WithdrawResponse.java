package com.Bank.Rest.model;

import java.math.BigDecimal;

public class WithdrawResponse {
    private BigDecimal balance;
    private String message;

    public WithdrawResponse(BigDecimal balance, String message) {
        this.balance = balance;
        this.message = message;
    }

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

