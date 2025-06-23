package com.java.jdbcreal.dao;

import java.util.List;

import com.java.jdbcreal.Employ;

public interface EmployDao {
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
}
