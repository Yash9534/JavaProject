package ProrammingRaghu;

import java.util.Scanner;

public class EvenEqualsOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
int sumEd=0,sumOd=0;
do {
	int r=n%10;
	if(r%2==0)
	sumEd=sumEd+r;
	else
		sumOd=sumOd+r;
		n=n/10;
}
while(n!=0);
if(sumEd==sumOd)
	System.out.println("pass");
else
	System.out.println("fail");


	}

}
