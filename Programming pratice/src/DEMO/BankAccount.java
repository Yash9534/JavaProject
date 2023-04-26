package DEMO;

public class BankAccount {
long acno;
long contact;
public BankAccount(long acno,long contac)
{
	this.acno=acno;
	this.contact=contact;
}
void printAccount()
{
	System.out.println("account number is "+acno);
	System.out.println("contact number is "+contact);
}
}
