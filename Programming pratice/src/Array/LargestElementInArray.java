package Array;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
int [] arr= new int[5];
int max;
Scanner sc=new Scanner(System.in);
System.out.println("enter array element");

for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
	max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println(max);
	}
	}


