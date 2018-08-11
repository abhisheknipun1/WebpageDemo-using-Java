package com.nipun.mywebdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcessLoginTest {

	@Test
	public void testMultiply() {
		assertEquals(12, new ProcessLogin().multiply(4,3));
	}

	@Test
	public void testMultiply1() {
		assertEquals(123, new ProcessLogin().multiply(41,3));
	}
	
	@Test
	public void testMultiply2() {
		assertEquals(123, new ProcessLogin().multiply(41,3));
	}
}
