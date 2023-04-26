package test;

import java.util.Scanner;

public class DivisorNumber {

public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int count =1;
for(int i=1;i<=n/2;i++)
{
	if(n%i==0)
		count++;
}
System.out.println("number of divisors:"+count);
}
}

