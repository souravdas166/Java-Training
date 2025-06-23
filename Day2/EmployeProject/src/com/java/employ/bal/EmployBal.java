package com.java.employ.bal;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class EmployBal {
	static EmployDao employDao;
	static StringBuilder sb;
	
	static {
		employDao = new EmployDaoImpl();
		sb = new StringBuilder();
	}
	
	public String readEmployFileBal() throws FileNotFoundException, ClassNotFoundException, IOException {
		return employDao.readEmployFileDao();
	}
	
	public String writeEmployFileBal() throws FileNotFoundException, IOException {
		return employDao.writeEmployFileDao();
	}
	
	public String deleteEmployBal(int empno) {
		return employDao.deleteEmployDao(empno);
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return employDao.updateEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	
	public Employ searchEmployBal(int empno) {
		return employDao.searchEmployDao(empno);
	}
	
	public List<Employ> showEmployBal() {
		return employDao.showEmployDao();
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return employDao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public boolean validateEmploy(Employ employ) {
		boolean isValid = true;
		if (employ.getName().length() < 5) {
			sb.append("Employ Name Contains Min 5 characters...\r\n");
			isValid = false;
		}
		if (employ.getDept().length() < 3) {
			sb.append("Department Contains Min. 3 Characters...\r\n");
			isValid = false;
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 80000) {
			sb.append("Salary Must be Between 10000 and 80000...\r\n");
			isValid = false;
		}
		return isValid;
	}
}
