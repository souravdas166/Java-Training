package com.java.bankproject.dao;

import java.sql.SQLException;

import com.java.bankproject.model.Accounts;

public interface BankDao {
	String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException;

	Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
}
