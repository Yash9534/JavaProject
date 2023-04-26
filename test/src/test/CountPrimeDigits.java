package test;
import java.util.Scanner;
public class CountPrimeDigits {
static int CountPrimeDigits(int x) {
	int pc=0;
	do {
		int d=x%10;
		if(d==1||d==2||d==3||d==5||d==7)
		pc++;
		x=x/10;
	}while(x!=0);
	return pc;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
int count=CountPrimeDigits(n);
System.out.println("number of prime digits: "+count);
	}

}
