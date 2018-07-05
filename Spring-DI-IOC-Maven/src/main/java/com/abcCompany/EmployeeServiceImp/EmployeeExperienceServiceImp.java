package com.abcCompany.EmployeeServiceImp;

import java.util.Date;

import com.abcCompany.Service.EmployeeExperienceService;

public class EmployeeExperienceServiceImp implements EmployeeExperienceService {

	public String getExperience(String companyName, String projects, Date startDate, Date endDate) {
		String experience = "Compnay name " + companyName + " Worked on projects " + projects
				+ " start date: " + startDate + " End date: " + endDate;
		return experience;
	}

}
