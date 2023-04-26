package test;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
boolean rs=isPerfectNumber(n);
if(rs==true)
	System.out.println(n+" is a Perfect number");
else
	System.out.println(n+" is not a perfect number");
	}
static boolean isPerfectNumber(int x)
{
	int sum=0;       
	for(int i=1;i<=x/2;i++)           
	{
		if(x%i==0)
			sum=sum+i;
	}
	if (sum==x)
		return true;
	else
		return false;
}
}






