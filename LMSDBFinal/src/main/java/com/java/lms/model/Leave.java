package com.java.lms.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Leave {
	private int leaveId;
	private int totalnoLeave;
	private String mngrComnt;
	private int empId;
	private Date leavestartDt;
	private Date leaveEndDt;
	private LeaveType leavetype;
	private Status leavestatus;
	private String leaveReason;
	
}
