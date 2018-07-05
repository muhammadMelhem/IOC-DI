package com.abcCompany.EmployeeServiceImp;

import com.abcCompany.Service.EmployeeService;

public class EmpServiceImp implements EmployeeService {

	public String getEmployeeDetails(String name, int age, String department) {
		String details = "NAME is: " + name + " AGE is: " + age + " FROM department: " + department;
		return details;
	}

}
