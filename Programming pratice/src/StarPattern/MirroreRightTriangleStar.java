package StarPattern;

import java.util.Scanner;

public class MirroreRightTriangleStar {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number of row");
int row=sc.nextInt();
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=row-i;j++) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
