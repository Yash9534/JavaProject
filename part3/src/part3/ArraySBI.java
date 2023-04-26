package part3;

public class ArraySBI {
long acno;
String acholder;
long contactno;
public ArraySBI(long acno, String acholder, long contactno) {
	this.acno = acno;
	this.acholder = acholder;
	this.contactno = contactno;
}
public String toString()
{
	return acholder+" "+acno+" "+contactno;
}
}
class ICICI
{
	long acno;
	long contactno;
	double bal;
	public ICICI(long acno, long contactno, double bal) {
		super();
		this.acno = acno;
		this.contactno = contactno;
		this.bal = bal;
	}
	public String toString()
	{
		return acno+" "+contactno+" "+bal;
	}
}

