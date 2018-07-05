package com.abcCompany.domain;

import com.abcCompany.Service.EmployeeService;

public class EmployeeDetails {

	private String name;
	private int age;
	private String department;

	private EmployeeService employeeService;

	public EmployeeDetails(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String getEmployeeDetails() {
		return this.employeeService.getEmployeeDetails(name, age, department);
	}

	@Override
	public String toString() {
		return "EmployeeDetails [Name=" + name + ", age=" + age + ", department=" + department + "]";
	}

}
