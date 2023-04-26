package test;

import java.util.Scanner;

public class MainLoop5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);
}
}
