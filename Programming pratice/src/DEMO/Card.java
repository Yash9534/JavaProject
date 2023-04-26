package DEMO;

public class Card extends BankAccount{
int pin;

public Card(long acno, long contac, int pin) {
	super(acno, contac);
	this.pin = pin;
}
void printCard()
{
	printAccount();
	System.out.println("Card pin is "+pin);
}
}
