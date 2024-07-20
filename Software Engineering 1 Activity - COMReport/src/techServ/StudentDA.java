package techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Student;

public class StudentDA 
{
	private ArrayList<Student> studentList;
	
	public StudentDA() throws FileNotFoundException
	{
		Scanner studentInfoFile = new Scanner(
												   new FileReader("C://Users//Rosh Torres//Documents//New Era University//COMReport - Data Files/studentInfo.csv"));
		
		studentList = new ArrayList<Student>();
		
		while(studentInfoFile.hasNext())
		{
			String rowStudent = new String();
			rowStudent = studentInfoFile.nextLine();
			
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			
			Student student = new Student();
			
			//store data in Student object
			student.setStudentNumber(rowStudentSpecific[1].trim());
			student.setName(rowStudentSpecific[2].trim());
			student.setProgram(rowStudentSpecific[3].trim());
			
			//create courseDA
			CourseDA courseDA = new CourseDA(student.getStudentNumber());
			
			//attach the courseList to Student object
			student.setCourseList(courseDA.getCourseList());
			
			studentList.add(student);
		}
	}
	
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}

}
