package techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Course;

public class CourseDA 
{
private ArrayList<Course> courseList;
	
	public CourseDA(String studentNumber) throws FileNotFoundException
	{
		Scanner scheduleInfoFile = new Scanner(
				                   new FileReader("C://Users//Rosh Torres//Documents//New Era University//COMReport - Data Files/scheduleInfo.csv"));
		
		courseList = new ArrayList<Course>();
		
		while(scheduleInfoFile.hasNext())
		{
			String courseRow = new String();
			courseRow = scheduleInfoFile.nextLine();
			
			String[] courseSpecific = new String[6];
			courseSpecific = courseRow.split(",");
			
			//Declare the JobHistory object
			Course course = new Course();
			
			//Put data in the JobHistory object
			if(studentNumber.contentEquals(courseSpecific[0]))
			{
				course.setCourseCode(courseSpecific[1]);
				course.setDescription(courseSpecific[2]);
				course.setUnit(Integer.parseInt(courseSpecific[3]));
				course.setDay(courseSpecific[4]);
				course.setTime(courseSpecific[5]);
				
				courseList.add(course);
			}
		 }
	}

	public ArrayList<Course> getCourseList() 
	{
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) 
	{
		this.courseList = courseList;
	}

}
