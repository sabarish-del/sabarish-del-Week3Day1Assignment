package Week3Day1;

public class Student {

	void getStudentInfo(int id)
	{
		System.out.println("The first value in getStudentInfo with id is : "+ id);
	}
	void getStudentInfo(int id, String name)
	{
		System.out.println("The first value in getStudentInfo with id is : "+ id);
		System.out.println("The second value is getstudentino :" +name);
	}
	void getStudentInfo(String email , long phoneNumber)
	{
		System.out.println("The first value in getStudentInfo with id is : "+ email);
		System.out.println("The second value is :" +phoneNumber);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu= new Student();
		stu.getStudentInfo(108219);
		stu.getStudentInfo(108219, "sabarish");
		stu.getStudentInfo("sabarish", 948898771);
		

	}

}
