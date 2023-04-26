package Array;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		int a[][]=new int[2][4];
		int b[][]=new int[2][4];
		int c[][]=new int[2][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first matrix data");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter second matrix data");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("second matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			    c[i][j]=a[i][j]+b[i][j];
			    System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
