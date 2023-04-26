package test;
import java.util.Scanner;
public class BiggestDigits {
static int biggestOfDigits(int x)
{
	int big=-9;
	do { 
		int r=x%10;
		if(r>big)
			big=r;
		x=x/10;
	}
	while(x!=0);
	return big;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number ");
int r=sc.nextInt();
int big=biggestOfDigits(r);
System.out.println(" Biggest of digits is: "+big);
	}

}
