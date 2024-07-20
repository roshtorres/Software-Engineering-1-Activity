package domain;

import java.util.ArrayList;

public class Student 
{
	private String studentNumber;
	private String name;
	private String program;
	private ArrayList<Course> courseList;
	
	public String getStudentNumber() 
	{
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) 
	{
		this.studentNumber = studentNumber;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getProgram() 
	{
		return program;
	}
	public void setProgram(String program) 
	{
		this.program = program;
	}
	
	public ArrayList<Course> getCourseList() 
	{
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) 
	{
		this.courseList = courseList;
	}
	
	public String toString()
	{
		String output = new String();
		
		output += "Student Number: " + studentNumber + "\t" +
				  "Student name: " + name + "\t" +
				  "Program: " + program + "\n\n" +
				  "Schedule\n" + 
				  "Course Code\t" + "Description\t" + "Unit\t" +  "Day\t" + "Time\n";
				
		for(Course course : courseList)
		{
			output += course;
		}
		
		return output;
	}
	
}

