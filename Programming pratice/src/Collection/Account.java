package Collection;

public class Account implements Comparable<Account>{
double bal;
long acno;
String acholder;
public Account(double bal, long acno, String acholder) {
	this.bal = bal;
	this.acno = acno;
	this.acholder = acholder;
}
public String toString()
{
	return bal+" "+acno+" "+acholder;
}
public int compareTo(Account ob) {
	if(this.acholder.compareTo(ob.acholder)>=1)
	return 1;
	else if(this.acholder.compareTo(ob.acholder)>0)
		return -1;
	else
		return 0;
}
}