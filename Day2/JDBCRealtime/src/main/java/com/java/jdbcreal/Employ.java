package com.java.jdbcreal;

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

		private int empno;
		private String name;
		private String dept;
		private Gender gender;
		private String design;
		private double basic;
}
