package part3;
import java.util.Scanner;
public class AccountSBI {
	long acno;
	int pin;
	double bal;
	public AccountSBI(long acno, int pin, double bal) {
		
		this.acno = acno;
		this.pin = pin;
		this.bal = bal;
	}
	public void withdrawlMoney()
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("enter the pin");
			int p=s.nextInt();
			if (p==pin)
			{
				System.out.println("enter the ammount you want to withdraw");
				double ammount=s.nextInt();
				if(ammount<=bal)
				{
					bal=bal-ammount;
					System.out.println("collect your cash");
				}
				else
				{
					throw new LowBalException("Insufficent bal");
				}
			}
			else
			{
				throw new InvalidPin("wrong pin");
			}
		}
		catch(InvalidPin e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(LowBalException e2)
		{
			System.out.println(e2.getMessage());
		}
		finally
		{
			System.out.println("Thank you for using SBI service");
		}
	}
	public void sample()
	{
		System.out.println("hello");
	}
	public static void main (String [] args) throws Exception {
    AccountSBI ob=new AccountSBI(10000200035666l,9966,85000d);
	ob.withdrawlMoney();
	ob.sample();
}
}