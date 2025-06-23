package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test
	public void testEvenOdd() {
		Data data = new Data();
		assertTrue(data.evenOdd(4));
		assertFalse(data.evenOdd(5));
	}
	
	@Test
	public void testPosNeg() {
		Data data = new Data();
		assertTrue(data.posno(4));
		assertFalse(data.posno(-5));
	}
	
	
	@Test
	public void testNull() {
		Data obj = null;
		assertNull(obj);
		Data data = new Data();
		assertNotNull(data);
	}
	
	@Test
	public void testArrayEquals() {
		int[] a =new int[] {1,2,3,4};
		int[] b = new int[] {1,2,3,4};
		assertArrayEquals(a,b);
	}
	
	@Test
	public void testmax() {
		Data data = new Data();
		assertEquals(7,data.max3(7, 5, 2));
		assertEquals(7,data.max3(5, 7, 2));
		assertEquals(7,data.max3(2, 5, 7));
		
		
	}

	@Test
	public void testSum() {
		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
		
		
		
//		@Test
//		public void testSayHello() {
//			Data data = new Data();
//			assertEquals("Welcom To jAva , 0);
			
		}
	}


