package ProrammingRaghu;

import java.util.Scanner;

public class HowManyPrimeNumber {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int count =0;
for(int i=1;i<=n;i++)
{
	boolean rs=isPrime(i);
	if(rs==true)
		count++;
}
System.out.println(count);
	
	}

	static boolean isPrime(int x) {
		for(int j=2;j<=x/2;j++)
	{
			if(x%j==0)
			{
				boolean rs = false;
				break;
			}
		}
		return true;
	}
}
