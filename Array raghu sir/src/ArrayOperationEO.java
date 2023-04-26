   import java.util.Scanner;
public class ArrayOperationEO {
private static final Object[] ar = null;
int [] readArray()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("enter "+n+" value");
	for (int i=0; i<ar.length; i++)
	{
		ar[i]=sc.nextInt();
	}
	return ar;
}
void displayArray(int []ar)
{
	for (int i=0; i<ar.length; i++)
	{
		System.out.println(ar[i]+" ");
	}
	System.out.println();
}
public int[] countEO(int[] x)
{
	int ec=0,oc=0;
	for(int i=0; i<x.length; i++)
	{
	     if (x[i]%2==0)
			ec++;
		else
			oc++;
	}
	int count[]= {ec,oc};
	return count;
}
}
