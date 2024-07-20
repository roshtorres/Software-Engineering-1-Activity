package com.softEng.objects;
import java.util.ArrayList;
import java.util.List;

public class ClassList 
{
	public static void main(String[] args) 
	{
		//STUDENT
		Student student = new Student();
		
		student.setStudentNo("1234");
		student.setLastName("Dela Cruz");
		student.setFirstName("Juan");
		student.setGender("M");
		student.setProgram("BSCS");
		
		//COURSE
		List<Course> courseList = new ArrayList<Course>();
		
		Course course1 = new Course();
		course1.setCourseCode("CSL331-18");
		course1.setDescription("SoftEng 1 Lab");
		course1.setUnit(1);
		
		Course course2 = new Course();
		course2.setCourseCode("CCS331-18");
		course2.setDescription("SoftEng 1 Lec");
		course2.setUnit(2);
		
		Course course3 = new Course();
		course3.setCourseCode("CCS211-18");
		course3.setDescription("Info Management 1");
		course3.setUnit(3);
		
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		student.setCoursesTaken(courseList);
		
		System.out.println(student);
	}

}
