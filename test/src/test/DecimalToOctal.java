package test;
import java.util.Scanner;
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
String p=toOctal(n);
System.out.println(p);
	}
    static String toOctal(int x) {
		// TODO Auto-generated method stub
    	{
	String p="";
	do {
		int r=x%8;
		p=r+p;
		x=x/8;
	}
	while(x!=0);
	return p;
}
}
}