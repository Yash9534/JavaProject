package Array;

import java.util.Scanner;

public class BiggestElement {

	public static void main(String[] args) {
int [] a=new int[5];
int bigg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array element ");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
bigg=a[0];
for(int i=1;i<a.length;i++)
{
	if(a[i]>bigg)
	{
		bigg=a[i];
	}
}
System.out.println(bigg);
	}

}
