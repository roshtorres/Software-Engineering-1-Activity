package com.torres.hope.techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.torres.hope.domain.Job;


public class JobDA 
{
	private String description;
	
	public JobDA(String jobCode) throws FileNotFoundException
	{
		Scanner jobFile = new Scanner(
					      new FileReader("C://Users//Rosh Torres//Documents//New Era University//Data File/JOBFILE.csv"));
		
		description = new String();
		
		while(jobFile.hasNext())
		{
			String jobRow = new String();
			jobRow = jobFile.nextLine();
		
			String[] jobSpecific = new String [2];
			jobSpecific = jobRow.split(",");
			
			//Declare the Job object
			Job job = new Job();
		
			//Put data in the Job object
			if(jobCode.contentEquals(jobSpecific[0]))
			{
				job.setJobDescription(jobSpecific[1]);
				description = job.toString();
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
