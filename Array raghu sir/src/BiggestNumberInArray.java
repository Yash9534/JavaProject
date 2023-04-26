import java.util.Scanner;
public class BiggestNumberInArray {
static int getBiggest (int[] x)
{
int big=x[0];
for(int i=1;i<x.length;i++)
{
	if(x[i]>big)
		big=x[i];
}
return big;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter "+n+" values");
	for (int i=0;i<ar.length; i++)
	{
		System.out.println(ar[i]+" "); 
	}
	int big=getBiggest(ar);
	System.out.println("biggest element of array is "+big);
}
}
