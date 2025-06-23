package com.java.lmsdb.model;

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
public class Employ {
	int empId;
	String empName;
	String empEmail;
	String empMobileNumber;
	String empDepartment;
	int empManagerId;
	int empAvailLeave;
}
