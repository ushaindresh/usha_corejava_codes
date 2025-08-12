package oops;

class Course
{
	String coursename = " core Java ";
	void showCourse()
	{
		System.out.println("Course :" + coursename);
	}
}

class Student extends Course
{
	String name = " Amit";
	void showStudent()
	{
		System.out.println("Student :"
				+ "" + name);
	}
}

public class SingleInheritance {
	 public static void main (String[] args) {
		 Student s = new Student();
		 s.showCourse();
		 s.showStudent();
	 }

}
