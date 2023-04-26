package Logical;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int no=s.nextInt();
		
		for(int no1=1;no1<=no;no1++) 
		{
			int temp=0;
			for(int i=2;i<=no1-1;i++)
			{
				if(no1%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no1);
			}
		}		
	}
}
