package test;

import java.util.Scanner;

public class MainLoop6 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int count =1;
for(int i=1;i<=n/2;i++)
{
	if(n%i==0)
		count++;
}
System.out.println("number of factorial/divisors:"+count);
}
}