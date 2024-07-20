package com.torres.hope.domain;

public class JobHistory 
{
	private String job;
	private String jobDescription;
	private String department;
	private String departmentDescription;
	private Double salary;
	private String effectiveDate;
	
	public String getJob() 
	{
		return job;
	}
	public void setJob(String job) 
	{
		this.job = job;
	}
	
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
	public Double getSalary() 
	{
		return salary;
	}
	public void setSalary(Double salary) 
	{
		this.salary = salary;
	}
	
	public String getEffectiveDate() 
	{
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) 
	{
		this.effectiveDate = effectiveDate;
	}
	
	public String getJobDescription() 
	{
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) 
	{
		this.jobDescription = jobDescription;
	}
	
	public String getDepartmentDescription() 
	{
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) 
	{
		this.departmentDescription = departmentDescription;
	}
	
}
