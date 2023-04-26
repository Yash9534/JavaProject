package Collection;

public class Sbi {
	String bankName;
long acno;
String acholder;
long contactno;
public Sbi(String bankName,long acno, String acholder, long contactno) {
	this.bankName=bankName;
	this.acno = acno;
	this.acholder = acholder;
	this.contactno = contactno;
}
public String toString() {
	return bankName+" "+acno+" "+acholder+" "+contactno;
}
}
