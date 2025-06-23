package com.java.jdbcreal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.java.jdbcreal.Employ;
import com.java.jdbcreal.util.ConnectionHelper;

public class EmployDaoImpl implements EmployDao {
	
	Connection connection;
	PreparedStatement pstm;
	
	public List<Employ> showEmployDao() throws ClassNotFoundException,SQLException{
		connection = ConnectionHelper.getConnection();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pstm = connection.prepareStatement(cmd);
		ResultSet rs = pstm.executeQuery();
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		Employ employ = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno = ?";
		pstm = connection.prepareStatement(cmd);
		pstm.setInt(1, empno);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesign(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pstm = connection.prepareStatement(cmd);
		pstm.setInt(1, employ.getEmpno());
		pstm.setString(2, employ.getName());
		pstm.setString(3, employ.getGender().toString());
		pstm.setString(4, employ.getDept());
		pstm.setString(5, employ.getDesign());
		pstm.setDouble(6, employ.getBasic());
		pstm.executeUpdate();
		return "Employ Record Inserted...";
	}

	}

}
