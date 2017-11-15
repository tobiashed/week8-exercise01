package com.exercises.maven.week8_exercise01;

import java.util.Random;

public class MyRandomMethods {
	Random random = new Random();
	
	public int randomFrom1To10() {
		int result = 0;
		result = random.nextInt(10)+1;
		return result;
	}
	public int randomFrom11To20() {
		int result = 0;
		result = random.nextInt(10)+11;
		return result;
	}
	public int randomFrom21To30() {
		int result = 0;
		result = random.nextInt(10)+21;
		return result;
	}
	public int randomFrom31To40() {
		int result = 0;
		result = random.nextInt(10)+31;
		return result;
	}
	public int randomFrom41To50() {
		int result = 0;
		result = random.nextInt(10)+41;
		return result;
	}
}
