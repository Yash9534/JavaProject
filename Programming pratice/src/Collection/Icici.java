package Collection;

public class Icici {
	String BankName;
long acno;
long contactno;
double bal;
public Icici(String BankName,long acno, long contactno, double bal) {
	this.BankName=BankName;
	this.acno = acno;
	this.contactno = contactno;
	this.bal = bal;
}
public String toString() {
return BankName+" "+acno+" "+contactno+" "+bal;
}
}
