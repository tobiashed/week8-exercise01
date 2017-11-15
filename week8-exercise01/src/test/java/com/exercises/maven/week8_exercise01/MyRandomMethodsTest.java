package com.exercises.maven.week8_exercise01;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {
	
	MyRandomMethods mrm = new MyRandomMethods();
	
	@Test
	public void testRandomFrom1To10() {
		assertTrue(mrm.randomFrom1To10() > 0 && (mrm.randomFrom1To10() < 11));
	}
	@Test
	public void testRandomFrom11To20() {
		assertTrue(mrm.randomFrom11To20() > 10 && (mrm.randomFrom11To20() < 21));
	}
	@Test
	public void testRandomFrom21To30() {
		assertTrue(mrm.randomFrom21To30() > 20 && (mrm.randomFrom21To30() < 31));
	}
	@Test
	public void testRandomFrom31To40() {
		assertTrue(mrm.randomFrom31To40() > 30 && (mrm.randomFrom31To40() < 41));
	}
	@Test
	public void testRandomFrom41To50() {
		assertTrue(mrm.randomFrom41To50() > 40 && (mrm.randomFrom41To50() < 51));
	}
}
