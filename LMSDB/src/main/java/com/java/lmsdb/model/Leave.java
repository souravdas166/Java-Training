package com.java.lmsdb.model;

import java.sql.Date;

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
public class Leave {
	int leaveId;
	int noOfDays;
	String leaveManagerComments;
	int empId;
	Date startDate;
	Date endDate;
	LeaveType leaveType;
	LeaveStatus leaveStaus = LeaveStatus.PENDING;
	String leaveReason;
}
