package test;

import java.util.Scanner;

public class Mainloop7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n,sumE=0,sumO=0;
		Scanner s=new Scanner(System.in);
	System.out.println("enter the value of n:");
	n=s.nextInt();
	for(int i=0;i<=n;i++)
	{
		int o=s.nextInt();
	}
	for(int i=0;i<=n;i++)
	{
		if(n%2==0)
		{
			sumE=sumE+i;
		}
		else
		{
			sumO=sumO+i;
		}
	}
	System.out.println("Sum of even number:"+sumE);
	System.out.println("Sum of odd number:"+sumO);
	
	}
	}

