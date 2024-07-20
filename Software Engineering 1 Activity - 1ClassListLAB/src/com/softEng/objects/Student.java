package com.softEng.objects;
import java.util.List;

public class Student 
{
	private String studentNo;
	private String lastName;
	private String firstName;
	private String gender;
	private String program;
	private List<Course> coursesTaken;
	
	public String getStudentNo() 
	{
		return studentNo;
	}
	public void setStudentNo(String studentNo) 
	{
		this.studentNo = studentNo;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public String getProgram() 
	{
		return program;
	}
	public void setProgram(String program) 
	{
		this.program = program;
	}
	
	public List<Course> getCoursesTaken() 
	{
		return coursesTaken;
	}
	public void setCoursesTaken(List<Course> coursesTaken) 
	{
		this.coursesTaken = coursesTaken;
	}
	
	public String toString()
	{
		String studentOutput = new String();
		
		studentOutput += "Student Number: " + studentNo + 
				         "\nName: " + lastName.toUpperCase() + ", " + firstName +
				         "\nGender: " + gender +
				         "\nProgram: " + program +
				         "\n\nCOURSES TAKEN\n";
		
		for(Course course : coursesTaken)
		{
			studentOutput += course;
		}
		
		return studentOutput;
	}
	
}
