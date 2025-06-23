package com.java.phonepay.dao;

import java.sql.SQLException;

public interface DaoPhonepay {
	int validate(String userName, String password) throws ClassNotFoundException, SQLException;
	int debit(double mobile, double Withdrawamt ,String userName,String password) throws ClassNotFoundException, SQLException;
}
