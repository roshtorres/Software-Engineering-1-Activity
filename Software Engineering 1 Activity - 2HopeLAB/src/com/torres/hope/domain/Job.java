package com.torres.hope.domain;

public class Job 
{
	private String jobCode;
	private String jobDescription;
	
	public String getJobCode() 
	{
		return jobCode;
	}
	public void setJobCode(String jobCode) 
	{
		this.jobCode = jobCode;
	}
	
	public String getJobDescription() 
	{
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) 
	{
		this.jobDescription = jobDescription;
	}
	
	public String toString()
	{
		String jobOutput = new String();
			
		return jobOutput += jobDescription;
	}
	
}
