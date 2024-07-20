package com.torres.hope.techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.torres.hope.domain.Employee;

public class EmployeeDA 
{
	private ArrayList<Employee> employeeList;
	
	public EmployeeDA() throws FileNotFoundException
	{
		Scanner empFile = new Scanner(
					      new FileReader("C://Users//Rosh Torres//Documents//New Era University//Data File/EMPFILE.csv"));
	
		employeeList = new ArrayList<Employee>();
		
		while(empFile.hasNext())
		{
			String empRow = new String();
			empRow = empFile.nextLine();
			
			String[]empRowSpecific = new String[7];
			empRowSpecific = empRow.split(",");
			
			//Declare the Employee object
			Employee employee = new Employee();
			
			//Put data in the Employee object
			employee.setEmpNo(empRowSpecific[0]);
			employee.setLastName(empRowSpecific[1]);
			employee.setFirstName(empRowSpecific[2]);
			employee.setGender(empRowSpecific[3]);
			
			JobHistDA jobHistDA = new JobHistDA(employee.getEmpNo());
			employee.setJobHist(jobHistDA.getJobHistList());
			
			employeeList.add(employee);
		}
	}

	public ArrayList<Employee> getEmployeeList() 
	{
		return employeeList;
	}
	public void setEmployeeList(ArrayList<Employee> employeeList) 
	{
		this.employeeList = employeeList;
	}
}
