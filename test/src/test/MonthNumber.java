package test;
import java.util.Scanner;
public class MonthNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the month number");
	int m=sc.nextInt();
	if(m>=1 && m<=12)
	System.out.println("valid month number");

	else
		System.out.println("invalid month number");
		
}
}
