package ProrammingRaghu;
import java.util.Scanner;
public class SumOfPrimeNumber {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
	boolean rs=isPrime(i);
	if(rs==true)
	sum=sum+i;
}
System.out.println("sum of prime number "+sum);
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