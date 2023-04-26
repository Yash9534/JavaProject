package test;
import java.util.Scanner;
public class CountDigit {
	static int CountDigits(int x)
	{
		int count=0;
		do {
			x=x/10;
			count++;
		}
		while(x!=0);
		return count;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int dc=CountDigits(n);

	System.out.println("number of digits"+dc);
	}

}
