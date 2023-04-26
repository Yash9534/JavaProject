package Array;

import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of the matrix: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][]mat=new int [row][col];
		System.out.println("enter"+row*col+"element row wise");
int ar[][]= {{23,25,67},{88,55,69},{89,69,86},{22,35,64}};
System.out.println(ar.length);
System.out.println(ar[0].length);
System.out.println(ar[1].length);
for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<ar[i].length;j++)
	{
		System.out.print(ar[i][j]+ " ");
	}
	System.out.println();
}
	}

}
