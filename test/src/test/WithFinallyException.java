package test;
import java.util.Scanner;
public class WithFinallyException {
public static void main(String[] args) {
	try {
		System.out.println("enter the first number");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		System.out.println("enter the second number");
		int num2=s.nextInt();
		int c=num1/num2;
		System.out.println(c);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("handled");
	}
	finally
	{
		System.out.println("okay");
	}
}
}

