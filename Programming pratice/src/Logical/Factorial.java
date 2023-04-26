package Logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
  System.out.println("enter the number");
		int no=s.nextInt(); int fact=1;
for(int i=no;i>=1;i--)
{
	fact=fact*i;
}	
	System.out.println(fact);

	}
	}

