package StarPattern;

import java.util.Scanner;

public class ReversedPyramidStar {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("enter the number of row");
	int row=sc.nextInt();
	for(int i=0;i<=row;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=row-i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}
