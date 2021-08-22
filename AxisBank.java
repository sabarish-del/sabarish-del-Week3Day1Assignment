package Week3Day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		//super.deposit();
		System.out.println("The depostied amount in Bankinfo is Rs:20,000/-");
	}
	public static void main(String[] args)
	{
		AxisBank AB=new AxisBank();
		AB.saving();
		AB.fixed();
		AB.deposit();
		AB.deposit();
	}
	
	

}
