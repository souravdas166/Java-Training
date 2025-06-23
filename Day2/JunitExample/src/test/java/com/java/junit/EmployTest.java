package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() {
		Employ obj = new Employ();
		assertNotNull(obj);
		Employ employ = new Employ(1,"Sandhan",Gender.MALE,"Java","Programmer",77723.21);
		assertEquals(1, employ.getEmpno());
		assertEquals("Sandhan", employ.getName());
		assertEquals(Gender.MALE,employ.getGender());
		assertEquals("Java",employ.getDept());
		assertEquals("Programmer",employ.getDesig());
		assertEquals(77723.21,employ.getBasic(),2);
		
	}

}
