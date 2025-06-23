package com.java.lms.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.java.lms.model.Leave;
import com.java.lms.model.LeaveType;

public interface LeaveDao {
	public String applyLeave(int empId, Date LeaveStartDate, Date LeaveEndDate, LeaveType LeaveType , String LeaveReason) throws ClassNotFoundException, SQLException;
	List<Leave> searchleavebyEmpID(int empId) throws ClassNotFoundException, SQLException;
	List<Leave> showpendingLeave(int managerId) throws ClassNotFoundException, SQLException;
	String manageLeaveDao(int leaveId, int mgrId, boolean isAccepted, String mgrComment)
			throws ClassNotFoundException, SQLException;
}
