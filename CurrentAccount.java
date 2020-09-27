import java.lang.*;

public class CurrentAccount extends Account
{
	public CurrentAccount(){};
	public CurrentAccount(String name, int id, float balance)
	{
		super(name,id,balance);
	}
	
	public void withdraw(float a)
	{
		if((Balance-a>500)&&(a>0))
		{
			Balance-=a;
			//return Balance;
		}
		else
			System.out.println(" You Must Keep 500 Taka In Your Account ");
	}
	
	//public void show()
	//{
		//super();
		//System.out.println(" For Current Account ");
	//}
}