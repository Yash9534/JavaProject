package test;
import java.util.Scanner;
public class SumDigit {
static int SumOfDigits(int x)
{
	int sum=0;
	do
	{
		int r=x%10;
		sum=sum+r;
		x=x/10;
	}
	while(x!=0);
	return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n: ");
	int n=sc.nextInt();
	int sum=SumOfDigits(n);
	System.out.println("sum of digits: "+sum);
}
}
