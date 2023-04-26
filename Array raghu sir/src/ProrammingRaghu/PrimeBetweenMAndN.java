package ProrammingRaghu;

import java.util.Scanner;

public class PrimeBetweenMAndN {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the value m & n ");
int m=sc.nextInt();
int n=sc.nextInt();
int count=0;
for(int i=m;i<=n;i++)
{
	boolean rs=isPrime(i);
	if(rs==true)
		count++;
}
System.out.println("number of prime number "+count);
	}

	static boolean isPrime(int x) {
		for(int j=2;j<=x/2;j++) {
			if(x%j==0)
			{
				boolean rs = false;
				break;
			}	}
		return true;
	}
}
