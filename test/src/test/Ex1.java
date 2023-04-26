package test;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the 1st number ");
int a=s.nextInt();
//5int b=s.nextInt();
System.out.println("enter the 2nd number ");
int b=s.nextInt();
try
{
	System.out.println(a/b);
}
catch(ArithmeticException e)
{
	System.out.println("never divide a number by zero");
}
	}

}

