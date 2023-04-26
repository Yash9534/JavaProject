package Logical;

import java.util.Scanner;

public class Arthmetic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two integer values: ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("sum is: "+(x+y));
	System.out.println("difference is: "+(x-y));
	System.out.println("product is: "+x*y);
	System.out.println("qutient is: "+x/y);
	System.out.println("reminder is: "+x%y);
	

	}

}
