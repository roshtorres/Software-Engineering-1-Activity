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
							  new FileReader("C:\\Users\\Rosh Torres\\Documents\\New Era University\\COMReport - Data Files/studentInfo.csv"));
		
		studentList = new ArrayList<Student>();
		
		while(studentInfoFile.hasNext())
		{
			String studentRow = new String();
			studentRow = studentInfoFile.nextLine();
			
			String[] studentSpecific = new String[4];
			studentSpecific = studentRow.split(",");
			
			//Declare the Student object
			Student student = new Student();
			
			//Put data in the Student object
			student.setStudentNumber(studentSpecific[1]);
			student.setName(studentSpecific[2]);
			student.setProgram(studentSpecific[3]);
			
			//Insert CourseDA object
			CourseDA courseDA = new CourseDA(student.getStudentNumber());
			student.setCourseList(courseDA.getCourseList());
			
			studentList.add(student);
		}
	}
	
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) 
	{
		this.studentList = studentList;
	}

}
