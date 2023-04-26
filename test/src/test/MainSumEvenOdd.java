package test;

import java.util.Scanner;

public class MainSumEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n: ");
int n=sc.nextInt();
int sum=0;
if(n%2==0)
{
	for(int i=0;i<=n;i=i+2)
	{
		sum=sum+i;
	}
	System.out.println("sum of even number "+sum);
}
else
	if(n%2!=0)
{
	for(int i=1;i<=n;i=i+2)
	{
		sum=sum+i;
	}
System.out.println("sum of odd number "+sum);
}
}
}
