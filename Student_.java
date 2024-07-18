package apjfsa;

public class Student_ {
	
	public static  class Student
	{
		//Initializing the variables
		int rollno;
		String name;
		long mobileno;
		String CourseName;
		
		//Method to print student details
		  void studentDetails()
		{
		//Statements To print Student details
		System.out.println(" Student rollno:"+rollno);
		System.out.println(" Student name:"+name);
		System.out.println(" mobile number:"+mobileno);
		System.out.println("Course name :"+CourseName);
		}
            //Main method
		 public static void main(String[] args)
		{
			//creating object for student
			Student s=new Student();
			
			//calling main method using object
			s.rollno=168;
			s.name="Tejusree";
			s.mobileno=630237989;
	        s.studentDetails();
		}

	}

}
