import java.lang.*;

public class CreditcardAccount extends Account 
{
	public CreditcardAccount(){};
	public CreditcardAccount(String name, int id, float balance)
	{
		super(name,id,balance);
	}
	public void withdraw(float a)
	{
		if(a>0)
		{
			Balance-=a;
			//return Balance;
		}
		else
			System.out.println(" Insufficient Balance ");
	}
	
	//public void show()
	//{
		//super();
		//System.out.println(" For CreditCard Account ");
	//}
}