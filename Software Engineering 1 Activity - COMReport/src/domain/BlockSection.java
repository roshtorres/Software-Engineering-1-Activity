package domain;

import java.util.ArrayList;

public class BlockSection 
{
	private String blockCode;
	private String description;
	private String adviser;
	private ArrayList<Student> studentList;
	
	public String getBlockCode() 
	{
		return blockCode;
	}
	public void setBlockCode(String blockCode) 
	{
		this.blockCode = blockCode;
	}
	
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getAdviser() 
	{
		return adviser;
	}
	
	public void setAdviser(String adviser) 
	{
		this.adviser = adviser;
	}
	
	public ArrayList<Student> getStudentList() 
	{
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) 
	{
		this.studentList = studentList;
	}
	
	public String toString()
	{
		String output = new String();
		
		output += "Block Section: " + blockCode + "\t" + 
			      "Block Section Description: " + description + "\n" +
			      "Class Adviser: " + adviser + "\n\n";
		
		for(Student student : studentList)
		{
			output += student;
		}
		
		return output;
	}

}
