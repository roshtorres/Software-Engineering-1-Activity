package com.torres.hope.domain;

public class Department 
{
	private String deptCode;
	private String deptDescription;
	
	public String getDeptCode() 
	{
		return deptCode;
	}
	public void setDeptCode(String deptCode) 
	{
		this.deptCode = deptCode;
	}
	
	public String getDeptDescription() 
	{
		return deptDescription;
	}
	public void setDeptDescription(String deptDescription) 
	{
		this.deptDescription = deptDescription;
	}
	
	public String toString()
	{
		String deptOutput = new String();
			
		return deptOutput += deptDescription;
	}
}
