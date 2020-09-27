import java.lang.*;
import java.util.*;

public class Start 
{
	public static void main(String[] args)
	{
		
		Account a=new Account();
		Account a1= new Account("SIAM",4444,1000);
		
		System.out.println(" For Current Account : ");
		CurrentAccount cu=new CurrentAccount();
		CurrentAccount cu1= new CurrentAccount("SAS",5555,5000);
		System.out.println(" For Current Account How You Want To Withdraw : ");
		cu1.withdraw(500);
		cu1.show();
		
		System.out.println(" For Saving Account : ");
		SavingAccount s=new SavingAccount();
		SavingAccount s1= new SavingAccount("SAMIUL",5555,5000);
		System.out.println(" For Saving Account How You Want To Deposit : ");
		s1.deposit(500);
		s1.show();
		
		System.out.println(" For Credit Card Account : ");
		CreditcardAccount cr=new CreditcardAccount();
		CreditcardAccount cr1= new CreditcardAccount("ALAM",5555,5000);
		System.out.println(" For Credit Card Account How You Want To Withdraw : ");
		cr1.withdraw(500);
		cr1.show();
	}
}