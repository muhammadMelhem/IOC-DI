package com.abcCompany.domain;

import java.util.Date;

import com.abcCompany.Service.EmployeeExperienceService;

public class EmployeeExperience {

	private String companyName;
	private String projects;
	private Date startDate;
	private Date endDate;

	private EmployeeExperienceService empExpService;
	private EmployeeDetails empDetails;

	public EmployeeExperience(EmployeeExperienceService empExpService, EmployeeDetails empDetails) {
		this.empExpService = empExpService;
		this.empDetails = empDetails;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEmployeeExperience() {
		String experince = this.empDetails.getEmployeeDetails() + "\n"
				+ this.empExpService.getExperience(companyName, projects, startDate, endDate);
		return experince;

	}

}
