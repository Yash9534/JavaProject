import java.util.Scanner;
public class ArrayOperation
{
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
public int countPrime(int[] ar) 
{
	int count=0;
	for(int i=0; i<ar.length; i++)
	{
		boolean rs=isPrime(ar[i]);
		if(rs==true)
			count++;
	}
	return count;

}
public boolean isPrime(int a)
{
	for(int i=2;i<=a/2;i++)
	{
		if(a%i==0)
			return false;
	}
	return true;
}
public int[] merge(int[] x, int[] y) {
int z[]=new int[x.length+y.length];
for(int i=0;i<x.length; i++)
{
	z[i]=x[i];
}
for(int i=0;i<y.length; i++)
{
	z[x.length+i]=y[i];
}
return z;
}
public int[] zigZag(int[] x, int[] y) {
	int z[]=new int[x.length+y.length];
	int i=0,k=0;
	while(i<x.length&&i<y.length)
	{
		z[k++]=x[i];
		z[k++]=y[i++];
	}
	while(i<x.length)
		z[k++]=x[i++];
	while(i<y.length)
		z[k++]=y[i++];
	return z;
}
public int[] insertArr(int[] x, int ele, int in) 
{
if(in<0||in>x.length)
{
	System.out.println("index not in the range");
	return x;
}
int []tp=new int[x.length+1];
tp[in]=ele;
for(int i=0; i<x.length;i++)
{
	if(i<in)
		tp[i]=x[i];
	else
		tp[i+1]=x[i];
}
return tp;
}
public int[] deleteArr(int[] x, int in) {
	if(in<0||in>=x.length)
	{
		System.out.println("index not in the range");
		return x;
	}
	int tp[]=new int[x.length-1];
	for(int i=0;i<x.length-1; i++)
	{
		if(i<in)
			tp[i]=x[i];
		else
			tp[i]=x[i+1];
	}
	return tp;
}
public int nthBiggest(int[] ar, int n) {
for (int i=0; i<ar.length;i++)
{
	int count=0;
	for(int j=0; j<ar.length; j++)
	{
		if(ar[j]>ar[i])
			count++;
	}
	if(count==n-1)
		return ar[i];
}
System.out.println(n+" the biggest is not there");
return 0;
}
}







