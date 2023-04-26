package test;
import java.util.Scanner;
public class SumPerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int e=sc.nextInt();
	int pSum=0;
	for (int i=1;i<=e;i++)
	{
		int n=i;
		int fact=1,sum=0;
		while(fact<=(n/2))
		{
			if(n%fact==0)
			{
				sum=sum+fact;
			}
		fact++;
		}
		if(sum==i)
		{
			pSum=pSum+i;
		}
	}
	System.out.println(pSum);
}
}
