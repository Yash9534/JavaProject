import java.util.Scanner;

public class AccounSBI {
long acno;
int pin;
double bal;
public AccounSBI(long acno, int pin, double bal) {
	super();
	this.acno = acno;
	this.pin = pin;
	this.bal = bal;
}
public void withdrawMoney(Throwable e1)
{
	Scanner s=new Scanner(System.in);
	try
	{
		System.out.println("enter the pin");
	     int p=s.nextInt();
	     if(p==pin)
	     {
	    	 System.out.println("enter the amount you want to withdraw");
	    	 double amount =s.nextDouble();
	    	 if (amount<=bal)
	    	 {
	    		 bal=bal-amount;
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
	catch(InvalidPin e11)
	{
		System.out.println(e11.getMessage());
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
public static void main(String[] args) {
	AccounSBI ob=new AccounSBI(10002558965484l,5599,80000d);
	ob.withdrawMoney(null);
	ob.sample();
}
}
