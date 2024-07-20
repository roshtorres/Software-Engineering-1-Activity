package com.torres.hope.main;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.torres.hope.domain.Employee;
import com.torres.hope.domain.JobHistory;
import com.torres.hope.techServ.EmployeeDA;

public class HopeMain 
{
	public HopeMain() throws FileNotFoundException
	{
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		List<Employee> empList = new ArrayList<Employee>();
		
		EmployeeDA employeeDA = new EmployeeDA();
		empList = employeeDA.getEmployeeList();
		
		for(Employee employee : empList)
		{
			System.out.println("Employee Number: " + employee.getEmpNo() + "\n" +
						       "Employee Name: " + employee.getLastName().toUpperCase() + ", " + employee.getFirstName().toUpperCase() + "\n" +
					           "Gender: " + employee.getGender());
			
			System.out.println("\n*****JOB HISTORY OF EMPLOYEE*****");
			
			for(JobHistory jobHistory : employee.getJobHist())
			{
				System.out.println("\nEffective Date: " + jobHistory.getEffectiveDate() + "\n" +
								   "Salary: " + "₱" + df.format(jobHistory.getSalary()) + "\n" + 
				                   "Job: " + jobHistory.getJobDescription() + " (" + jobHistory.getJob() + ")" + "\n" +
				                   "Department: " + jobHistory.getDepartmentDescription()  + " (" + jobHistory.getDepartment() + ")");
			}
			
			System.out.println("\n-----------------------------------\n");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		new HopeMain();
	}

}
