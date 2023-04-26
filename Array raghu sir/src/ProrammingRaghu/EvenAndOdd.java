package ProrammingRaghu;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int ec=0;
	int oc=0;
	do {
		int r=n%10;
		if(r%2==0)
			ec++;
		else
			oc++;
		n=n/10;
	}
	while(n!=0);
	System.out.println("no of even digits "+ec);
	System.out.println("no of odd digits "+oc);
	}
}
