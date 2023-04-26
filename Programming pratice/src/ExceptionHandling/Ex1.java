package ExceptionHandling;

import java.util.Scanner;

import Logical.Arthmetic;

public class Ex1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int a=s.nextInt();
System.out.println("enter the second number");
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
