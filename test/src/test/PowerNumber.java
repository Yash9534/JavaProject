package test;
import java.util.Scanner;
public class PowerNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	System.out.println("enter the power");
	int p=sc.nextInt();
	int r=1;
	for(int i=1;i<=p;i++)
	{
		r=r*n;
	}
	System.out.println(r);
}
}
