package com.rupali.util;

public class Employee {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(10);
		
		System.err.println(employee.getId());

	}

}
