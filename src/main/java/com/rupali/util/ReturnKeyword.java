package com.rupali.util;

public class ReturnKeyword {

	public static void main(String[] args) {
		
		int a=ReturnKeyword.m1();
		int b=ReturnKeyword.m2();
		
		System.err.println("sum of a and b is "+(a+b));

	}

	public static int m1() {
		return 10;
	}

	public static int m2() {

		int c = 201;

		if (c == 200) {
			return c;
		} else if (c == 300) {
			return c;
		} else if (c == 20) {
			return c;
		}

		return 50;

	}

}
