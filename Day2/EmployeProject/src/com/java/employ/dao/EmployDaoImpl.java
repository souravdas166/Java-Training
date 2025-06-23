package com.java.employ.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.java.employ.model.Employ;

public class EmployDaoImpl implements EmployDao{
	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}

	@Override
	public Employ searchEmployDao(int empno) {
		// TODO Auto-generated method stub
		Employ employfound = null;
		for(Employ emp : employList) {
			if(emp.getEmpno() == empno) {
				employfound = emp;
				break;
			}
			
		}
		return employfound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employfound = searchEmployDao(empno);
		if(employfound != null) {
			employList.remove(employfound);
			return "Employ Record Delete...";
		}
		return "Employ not found";
		
	}
	@Override
	public String updateEmployDao(Employ employUpdate) {
		Employ employFound = searchEmployDao(employUpdate.getEmpno());
		if (employFound !=null) {
			employFound.setName(employUpdate.getName());
			employFound.setGender(employUpdate.getGender());
			employFound.setDept(employUpdate.getDept());
			employFound.setDesig(employUpdate.getDesig());
			employFound.setBasic(employUpdate.getBasic());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
	
	@Override
	public List<Employ> showEmployDao() {
		// TODO Auto-generated method stub
		return employList;
	}
	@Override
	public String writeEmployFileDao() throws IOException {
		FileOutputStream fout = new FileOutputStream("c:/files/employproject.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(employList);
		objout.close();
		fout.close();
		return "Objects Stored in File Successfully...";
	}

	@Override
	public String readEmployFileDao() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("c:/files/employproject.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		employList = (List<Employ>)objin.readObject();
		return "Objects Restored from File...";
	}

}