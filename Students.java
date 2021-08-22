package Week3Day1;

public class Students extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Sabarish");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Information technology");

	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("108219");

	}
	
	public static void main(String[] args)
	{
		Students std=new Students();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentId();
		std.studentDept();
	}

}
