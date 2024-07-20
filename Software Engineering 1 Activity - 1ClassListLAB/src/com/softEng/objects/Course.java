package com.softEng.objects;

public class Course 
{
	private String courseCode;
	private String description;
	private int unit;
	
	public String getCourseCode() 
	{
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		
		this.courseCode = courseCode;
	}
	
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public int getUnit() 
	{
		return unit;
	}
	public void setUnit(int unit) 
	{
		this.unit = unit;
	}
	
	public String toString()
	{
		String courseOutput = new String();

		courseOutput += "Course Code: " + courseCode +
					    "\nDescription: " + description +
					    "\nNumber of Units: " + unit + "\n\n";
	
		return courseOutput;
	}
	
}
