package com.java.phonepay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private int accountNo;
	private String accountHolderName;
	private String userName;
	private String password;
	private String email;
	private double moblie;
	private double amount;
	
}
