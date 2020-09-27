import java.lang.*;

public class SavingAccount extends Account
{
	public SavingAccount(){};
	public SavingAccount(String name, int id, float balance)
	{
		super(name,id,balance);
	}
	public void deposit(float a)
	{
		if(a==500)
		{
			Balance+=a;
			//return Balance;
		}
		else
			System.out.println(" You Must Deposit 500 Taka In Your Account ");
	}
	
	//public void show()
	//{
		//super();
		//System.out.println(" For Saving Account ");
	//}
     	
}