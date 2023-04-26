package test;

import java.util.Scanner;

public class MainOddLoop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i=i+2)
	{
	
	System.out.println("odd number is "+i);
	}
	}
}
