package Logical;

import java.util.Scanner;

public class MainBig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integer values: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int big=x;
		if(y>big)
			big=y;
		if(z>big)
			big=z;
		System.out.println("biggest is: "+big);

	}

}
