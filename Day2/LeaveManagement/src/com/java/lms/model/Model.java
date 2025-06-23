package com.java.lms.model;

import java.util.Date;

public class Model {
	private int leaveId;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private int noOfDays;
	private String leaveReason;
	private LeaveType leaveType;
	private LeaveStatus leaveStatus;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public Model(int leaveId, int empId, Date leaveStartDate, Date leaveEndDate, int noOfDays, String leaveReason,
			LeaveType leaveType, LeaveStatus leaveStatus) {
		super();
		this.leaveId = leaveId;
		this.empId = empId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.noOfDays = noOfDays;
		this.leaveReason = leaveReason;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
	}
	public Model() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Model [leaveId=" + leaveId + ", empId=" + empId + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", noOfDays=" + noOfDays + ", leaveReason=" + leaveReason
				+ ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus + "]";
	}
	
	
	
}
