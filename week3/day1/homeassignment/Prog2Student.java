package week3.day1.homeassignment;

public class Prog2Student extends Prog2Department{
	
	public void studentName()
	{
		System.out.println("StudentName");
	}
	
	public void studentDept()
	{
		System.out.println("StudentDept");
	}
	
	public void studentId()
	{
		System.out.println("StudentId");
	}
	
	public static void main(String[] args) {
		
		Prog2Student prog2student = new Prog2Student();
		
		prog2student.collegeCode();
		prog2student.collegeName();
		prog2student.collegeRank();
		prog2student.deptName();
		prog2student.studentDept();
		prog2student.studentId();
		prog2student.studentName();
		

	}

}
