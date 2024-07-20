package com.torres.hope.techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.torres.hope.domain.Department;

public class DepartmentDA 
{
	
	private String description;
	
	public DepartmentDA (String departmentCode) throws FileNotFoundException
	{
		Scanner deptFile = new Scanner(
					       new FileReader("C://Users//Rosh Torres//Documents//New Era University//Data File/DEPFILE.csv"));
		
		description = new String();
		
		while(deptFile.hasNext())
		{
			String deptRow = new String();
			deptRow = deptFile.nextLine();
		
			String[] deptSpecific = new String [2];
			deptSpecific = deptRow.split(",");
		
			//Declare the Department object
			Department department = new Department();
		
			//Put data in the Department object
			if(departmentCode.contentEquals(deptSpecific[0]))
			{
				department.setDeptDescription(deptSpecific[1]);
				description = department.toString();
			}
		}
	}

	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}

}
