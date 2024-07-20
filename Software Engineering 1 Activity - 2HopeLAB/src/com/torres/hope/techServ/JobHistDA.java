package com.torres.hope.techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.torres.hope.domain.JobHistory;

public class JobHistDA 
{
	private ArrayList<JobHistory> jobHistList;
	
	public JobHistDA(String employeeNo) throws FileNotFoundException
	{
		Scanner jobHistFile = new Scanner(
				              new FileReader("C://Users//Rosh Torres//Documents//New Era University//Data File/JOBHISTFILE.csv"));
		
		jobHistList = new ArrayList<JobHistory>();
		
		while(jobHistFile.hasNext())
		{
			String jobHistRow = new String();
			jobHistRow = jobHistFile.nextLine();
			
			String[]jobHistSpecific = new String[7];
			jobHistSpecific = jobHistRow.split(",");
			
			//Declare the JobHistory object
			JobHistory jobHistory = new JobHistory();
			
			//Put data in the JobHistory object
			if(employeeNo.contentEquals(jobHistSpecific[0]))
			{
				jobHistory.setEffectiveDate(jobHistSpecific[2]);
				jobHistory.setSalary(Double.parseDouble(jobHistSpecific[3]));
				jobHistory.setJob(jobHistSpecific[1]);
				jobHistory.setDepartment(jobHistSpecific[4]);
				
				//Insert here Job object
				JobDA jobDA = new JobDA(jobHistory.getJob());
				jobHistory.setJobDescription(jobDA.getDescription());
						
				//Insert here Department object
				DepartmentDA departmentDA = new DepartmentDA(jobHistory.getDepartment());
				jobHistory.setDepartmentDescription(departmentDA.getDescription());
				
				jobHistList.add(jobHistory);
			}
		}	
	}

	public ArrayList<JobHistory> getJobHistList() 
	{
		return jobHistList;
	}

	public void setJobHistList(ArrayList<JobHistory> jobHistList) 
	{
		this.jobHistList = jobHistList;
	}

}
