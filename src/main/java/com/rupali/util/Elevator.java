package com.rupali.util;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Elevator {

	@Id
	private int A;
	private String B;
	private String C;
	
	private String D;

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}

}
