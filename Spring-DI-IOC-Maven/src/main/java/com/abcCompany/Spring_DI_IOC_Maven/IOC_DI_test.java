package com.abcCompany.Spring_DI_IOC_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abcCompany.domain.EmployeeDetails;
import com.abcCompany.domain.EmployeeExperience;

public class IOC_DI_test {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("Beans.xml");

		EmployeeDetails details = (EmployeeDetails) app.getBean("employeedetails");

		System.out.println("Based on Setter::: \n" + details.getEmployeeDetails());

		EmployeeExperience experience = (EmployeeExperience) app.getBean("employeeexperience");

		System.out.println("Based on Constructor:::\n"+experience.getEmployeeExperience());

	}

}
