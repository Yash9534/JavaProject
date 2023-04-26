import java.util.Scanner;
public class ProductOfArray {
public static void main(String[] args) {
	int[] a;
	int num;
	int prod=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array");
	num=s.nextInt();
	a=new int [num];
	System.out.println("enter the array element: ");
	for(int i=0;i<num; i++)
	{
		System.out.println("enter "+(i+1)+" value");
		a[i]=s.nextInt();
	}
	for (int i=0;i<num; i++)
	{
		prod=prod*a[i];
	}
	System.out.println("product of array elements is: "+prod);
	
}
}
