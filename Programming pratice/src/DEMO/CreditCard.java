package DEMO;

public class CreditCard extends Card{
double limit;

public CreditCard(long acno, long contac, int pin, double limit) {
	super(acno, contac, pin);
	this.limit = limit;
}
void printCredit()
{
	printCard();
	System.out.println("card limit is "+limit);
}
}
