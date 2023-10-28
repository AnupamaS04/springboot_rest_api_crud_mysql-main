package com.Bank.Rest.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 16, max = 16, message = "Account number must be exactly 16 digits")
	@Pattern(regexp = "^[0-9]+$", message = "Account number should contain only numbers")
	@Column(unique = true)
	private String accountNumber;

	@NotBlank(message = "Name is required")
	private String name;

	@Size(min = 6, max = 6, message = "Password must be 6 characters long")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9]).*$", message = "Password should contain both alphabets and numbers")
    private String password;

	@Email(message = "Invalid email address")
    private String emailAddress;

	@Size(min = 10, max = 10, message = "Contact info must be exactly 10 digits")
    @Pattern(regexp = "^[0-9]+$", message = "Contact info should contain only numbers")
    private String contactInfo;

	private BigDecimal balance;
	
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	 private List<Transaction> transactions = new ArrayList<>();

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id,
			@Size(min = 16, max = 16, message = "Account number must be exactly 16 digits") @Pattern(regexp = "^[0-9]+$", message = "Account number should contain only numbers") String accountNumber,
			@NotBlank(message = "Name is required") String name,
			@Size(min = 6, max = 6, message = "Password must be 6 characters long") @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9]).*$", message = "Password should contain both alphabets and numbers") String password,
			@Email(message = "Invalid email address") String emailAddress,
			@Size(min = 10, max = 10, message = "Contact info must be exactly 10 digits") @Pattern(regexp = "^[0-9]+$", message = "Contact info should contain only numbers") String contactInfo,
			BigDecimal balance) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.emailAddress = emailAddress;
		this.contactInfo = contactInfo;
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
}