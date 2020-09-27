import java.lang.*;

public class Account
{
	protected String Name;
	protected int ID;
	protected float Balance;
	
	public Account(){}
	public Account(String name, int id, float balance)
	{
		Name=name ; ID=id ; Balance=balance;
	}
	
	public void deposit(float a)
	{
		if(a>0)
		{
			Balance+=a;
			//return Balance;
		}
		else
			System.out.println(" Wrong Input ");
	}
	public void withdraw(float b)
	{
		if(Balance>b)
		{
			Balance-=b;
			//return Balance;
		}
		else
			System.out.println(" Insufficient Balance ");
	}
	
	public void show()
	{
		System.out.println("Name :"+Name);
		System.out.println("ID :"+ID);
		System.out.println("Balance :"+Balance);
	}
}