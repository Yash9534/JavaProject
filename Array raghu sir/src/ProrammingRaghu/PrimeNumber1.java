package ProrammingRaghu;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	boolean rs=true;
	for(int j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
			rs=false;
			break;
		}
	}
	if(rs==true)
		System.out.println(i+" ");
}
	}

}
